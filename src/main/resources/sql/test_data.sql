-- Insert test data into quiz_users
INSERT INTO quiz_users (username, password, email) VALUES
('john_doe', 'hashed_password_1', 'john.doe@example.com'),
('jane_smith', 'hashed_password_2', 'jane.smith@example.com'),
('alice_jones', 'hashed_password_3', 'alice.jones@example.com');

-- Insert test data into quizzes
INSERT INTO quizzes (title, description, created_by) VALUES
('General Knowledge Quiz', 'A quiz to test your general knowledge.', 1),
('Science Quiz', 'A quiz focused on various science topics.', 2),
('History Quiz', 'Test your knowledge of historical events.', 1);

-- Insert test data into questions
INSERT INTO questions (quiz_id, question_text, question_type) VALUES
(1, 'What is the capital of France?', 'multiple-choice'),
(1, 'Is the Earth flat?', 'true-false'),
(1, 'Which planet is known as the Red Planet?', 'multiple-choice'),
(2, 'What is the chemical symbol for water?', 'multiple-choice'),
(2, 'Is light a wave?', 'true-false'),
(3, 'Who was the first President of the United States?', 'multiple-choice');

-- Insert test data into answers
INSERT INTO answers (question_id, answer_text, is_correct) VALUES
(1, 'Paris', TRUE),
(1, 'London', FALSE),
(1, 'Berlin', FALSE),
(2, 'True', FALSE),
(2, 'False', TRUE),
(3, 'Mars', TRUE),
(3, 'Venus', FALSE),
(4, 'H2O', TRUE),
(4, 'O2', FALSE),
(5, 'True', TRUE),
(5, 'False', FALSE),
(6, 'George Washington', TRUE),
(6, 'Thomas Jefferson', FALSE);

-- Insert test data into results
INSERT INTO results (user_id, quiz_id, score) VALUES
(1, 1, 80), -- John Doe scored 80 in General Knowledge Quiz
(2, 2, 90), -- Jane Smith scored 90 in Science Quiz
(3, 3, 70), -- Alice Jones scored 70 in History Quiz
(1, 2, 85); -- John Doe scored 85 in Science Quiz

