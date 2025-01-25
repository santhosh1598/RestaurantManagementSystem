-- Insert dummy data into Restaurants
INSERT INTO Restaurants (name, location, contact_number, email) VALUES
('Restaurant A', 'Location A', '1234567890', 'contactA@restaurant.com'),
('Restaurant B', 'Location B', '0987654321', 'contactB@restaurant.com');

-- Insert dummy data into Tables
INSERT INTO Tables (restaurant_id, table_number, seating_capacity, status) VALUES
(1, 1, 4, 'Available'),
(1, 2, 2, 'Reserved'),
(2, 1, 6, 'Occupied');

-- Insert dummy data into Customers
INSERT INTO Customers (name, email, phone_number, address) VALUES
('John Doe', 'john.doe@example.com', '1112223333', '123 Main St'),
('Jane Smith', 'jane.smith@example.com', '4445556666', '456 Elm St');

-- Insert dummy data into Dishes
INSERT INTO Dishes (name, category, price) VALUES
('Caesar Salad', 'Appetizer', 5.99),
('Grilled Chicken', 'Main Course', 12.99),
('Chocolate Cake', 'Dessert', 6.99),
('Coke', 'Drink', 1.99);

-- Insert dummy data into Orders
INSERT INTO Orders (order_date, customer_id, restaurant_id, total_amount, order_status) VALUES
('2025-01-18 12:00:00', 1, 1, 25.97, 'Completed'),
('2025-01-18 13:00:00', 2, 2, 19.98, 'Pending');

-- Insert dummy data into Order_Items
INSERT INTO Order_Items (order_id, dish_id, quantity, price) VALUES
(1, 1, 1, 5.99),
(1, 2, 1, 12.99),
(1, 3, 1, 6.99),
(2, 2, 1, 12.99),
(2, 4, 2, 3.98);

-- Insert dummy data into Employees
INSERT INTO Employees (name, role, restaurant_id, salary) VALUES
('Alice Johnson', 'Chef', 1, 3000.00),
('Bob Brown', 'Waiter', 1, 1500.00),
('Charlie Davis', 'Manager', 2, 4000.00);

-- Insert dummy data into Shift_Schedules
INSERT INTO Shift_Schedules (employee_id, shift_date, shift_start_time, shift_end_time) VALUES
(1, '2025-01-18', '09:00:00', '17:00:00'),
(2, '2025-01-18', '12:00:00', '20:00:00'),
(3, '2025-01-18', '08:00:00', '16:00:00');

-- Insert dummy data into Reservations
INSERT INTO Reservations (restaurant_id, customer_id, table_id, reservation_date, reservation_time) VALUES
(1, 1, 1, '2025-01-18', '18:00:00'),
(2, 2, 3, '2025-01-18', '19:00:00');

-- Insert dummy data into Payments
INSERT INTO Payments (order_id, payment_date, payment_method, amount) VALUES
(1, '2025-01-18 12:30:00', 'Card', 25.97),
(2, '2025-01-18 13:30:00', 'Cash', 19.98);