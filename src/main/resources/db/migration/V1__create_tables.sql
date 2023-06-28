CREATE TABLE users (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          email VARCHAR(255) UNIQUE NOT NULL,
                          phone_number VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE appointments (
                              id SERIAL PRIMARY KEY,
                              patient_id INT REFERENCES patients(id),
                              doctor_id INT REFERENCES doctors(id),
                              appointment_date TIMESTAMP NOT NULL,
                              appointment_duration INT NOT NULL, -- duration in minutes
                              status VARCHAR(50) NOT NULL DEFAULT 'Scheduled'
);
