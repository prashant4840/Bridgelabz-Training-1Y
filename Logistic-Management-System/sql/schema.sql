-- ============================================================
-- Route Tracker System - Database Schema
-- ============================================================

CREATE DATABASE IF NOT EXISTS logistic_db;
USE logistic_db;

-- -------------------------------------------------------
-- Table: drivers
-- -------------------------------------------------------
CREATE TABLE IF NOT EXISTS drivers (
driver_id VARCHAR(20) PRIMARY KEY,
name VARCHAR(100) NOT NULL
);

-- -------------------------------------------------------
-- Table: checkpoints
-- -------------------------------------------------------
CREATE TABLE IF NOT EXISTS checkpoints (
checkpoint_id VARCHAR(20) PRIMARY KEY,
driver_id VARCHAR(20) NOT NULL,
location_name VARCHAR(100) NOT NULL,
checkpoint_type ENUM('DELIVERY', 'FUEL', 'REST') NOT NULL,
distance_from_last DOUBLE NOT NULL DEFAULT 0.0,
expected_duration DOUBLE NOT NULL DEFAULT 0.0,
actual_duration DOUBLE NOT NULL DEFAULT 0.0,
is_critical BOOLEAN NOT NULL DEFAULT FALSE,
FOREIGN KEY (driver_id) REFERENCES drivers(driver_id) ON DELETE CASCADE
);

-- -------------------------------------------------------
-- Sample Data
-- -------------------------------------------------------
INSERT INTO drivers (driver_id, name) VALUES
('D1204', 'Kavita Nair'),
('D1205', 'Rajan Mehta');

INSERT INTO checkpoints
(checkpoint_id, driver_id, location_name, checkpoint_type,
distance_from_last, expected_duration, actual_duration, is_critical)
VALUES
('CP001', 'D1204', 'Warehouse A', 'DELIVERY', 30.0, 20.0, 30.0, TRUE),
('CP002', 'D1204', 'Pump 12', 'FUEL', 40.0, 15.0, 15.0, TRUE),
('CP003', 'D1204', 'Motel X', 'REST', 20.0, 60.0, 65.0, FALSE),
('CP004', 'D1204', 'Client Hub', 'DELIVERY', 30.0, 25.0, 40.0, TRUE),
('CP005', 'D1205', 'Depot B', 'DELIVERY', 50.0, 30.0, 30.0, TRUE),
('CP006', 'D1205', 'Fuel Stop 7', 'FUEL', 25.0, 10.0, 20.0, TRUE);
