# ISU-2025-26-Sem-2-ICS3U

Author: Zayd Khan
Course: ICS3U  
Date: June 11 2026  

Description

I chose to create the Cybersecurity Awareness Certification for my ISU. It is a console-based Java application that gives users a 12-question multiple-choice test about cybersecurity. The test is split into two sections: Part A (Recognizing Cyber Threats) and Part B (Online Privacy & Safe Practices). 

To pass the test, the user needs to get at least 4 out of 6 questions right in each section, and an overall score of 75% (9/12). 

Features Included

Randomized Questions: The program uses `Math.random()` to pull 6 random questions from the 10-question banks for each part. I set up an `ArrayList` to track the used indexes so that questions never repeat during a test.
Parallel Arrays: The question banks are managed using three parallel `ArrayList` structures for each section (one for the questions, one for the multi-line options, and one for the correct answer letter).
Admin Backend: There is a hidden admin menu where you can add new questions to the database or remove existing ones by their ID number. 
Early Termination: If a user gets 3 questions wrong in a single section, or 4 questions wrong overall, the test stops immediately because it's mathematically impossible for them to pass.
Input Validation: A `while` loop checks to make sure the user only enters A, B, C, or D, so the program won't break if they type a random word or number.

How to Run the Program

1. Make sure you have Java installed on your computer.
2. Open your terminal or command prompt in the folder containing the file.
3. Compile the file by typing: `javac Main.java`
4. Run the program by typing: `java Main`

Admin Login Info

To access the admin panel to test the add/remove features, select option 2 from the main menu.
Password: `admin123`

Notes for Marking

All 20 questions from the provided answer key document have been coded into the initial lists as requested.
I used `Integer.parseInt(in.nextLine())` instead of `in.nextInt()` in the admin menu. This was done intentionally to avoid the scanner bug where it skips the next `nextLine()` input. 
