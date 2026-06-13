// NAME: Zayd Khan
// PROJECT: Cybersecurity Awareness Certification


import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // QUESTION BANK SETUP

        // Part A Lists: Recognizing Cyber Threats
        ArrayList<String> qsA = new ArrayList<String>();
        ArrayList<String> optsA = new ArrayList<String>();
        ArrayList<String> ansA = new ArrayList<String>();

        qsA.add("Phishing is best described as:");
        optsA.add("A) A type of computer virus that hides inside another program\nB) A scam where an attacker tries to trick you into revealing sensitive information by pretending to be a trusted source\nC) A method of physically stealing computer hardware\nD) A technique that improves the speed of your internet connection");
        ansA.add("B");

        qsA.add("Which of the following is a common red flag in a phishing email?");
        optsA.add("A) The sender's email address is from a well-known company you regularly do business with\nB) The email is addressed to you by your full name\nC) The email creates a sense of urgency and asks you to click a link to \"verify\" your account immediately\nD) The message contains no spelling or grammatical errors");
        ansA.add("C");

        qsA.add("What is ransomware?");
        optsA.add("A) Software that displays advertisements on your screen\nB) Malware that encrypts your files and demands payment in exchange for the decryption key\nC) A subscription fee charged by software companies\nD) A type of firewall used by large businesses");
        ansA.add("B");

        qsA.add("Which of the following is an example of social engineering?");
        optsA.add("A) Designing a new social media website\nB) Writing code to break a password by brute force\nC) Calling someone and pretending to be from IT support to get their login credentials\nD) Sending a file over the network without encryption");
        ansA.add("C");

        qsA.add("A Trojan is malware that:");
        optsA.add("A) Disguises itself as a legitimate or harmless program but performs malicious actions once installed\nB) Spreads automatically across networks without any user interaction\nC) Only attacks devices that are not connected to the internet\nD) Is a type of antivirus software");
        ansA.add("A");

        qsA.add("You receive a text message that says \"Your package could not be delivered. Click here to reschedule: bit.ly/xyz123.\" What should you do?");
        optsA.add("A) Click the link right away to make sure your package arrives on time\nB) Reply to the message asking for more details\nC) Do not click the link; verify the delivery directly through the courier's official website or app\nD) Forward the message to all your contacts to warn them");
        ansA.add("C");

        qsA.add("Which of the following best describes a man-in-the-middle attack?");
        optsA.add("A) An attack where a hacker physically stands between two people at an ATM\nB) An attack where an attacker secretly intercepts and possibly alters the communication between two parties\nC) A type of denial-of-service attack\nD) Hardware sabotage performed inside a server room");
        ansA.add("B");

        qsA.add("Vishing is a form of phishing carried out:");
        optsA.add("A) Over voice calls\nB) Through video games\nC) Using printed letters in the mail\nD) By installing software from a USB drive");
        ansA.add("A");

        qsA.add("Which one of the following is most likely a sign of a spoofed website?");
        optsA.add("A) The URL is spelled exactly the same as the official site, including the correct top-level domain\nB) The URL contains small misspellings or extra characters (e.g., \"amazon-login.com\" instead of \"amazon.com\")\nC) The site shows a padlock icon next to the URL\nD) The site loads quickly with no errors");
        ansA.add("B");

        qsA.add("Spyware is malware that primarily:");
        optsA.add("A) Encrypts your data and demands a ransom\nB) Secretly collects information about your activity, such as keystrokes or browsing history, and sends it to a third party\nC) Floods a website with requests until it crashes\nD) Improves your computer's performance by removing junk files");
        ansA.add("B");

        // Part B Lists: Online Privacy & Safe Practices
        ArrayList<String> qsB = new ArrayList<String>();
        ArrayList<String> optsB = new ArrayList<String>();
        ArrayList<String> ansB = new ArrayList<String>();

        qsB.add("Which of the following is the strongest password?");
        optsB.add("A) password123\nB) Farzin2009\nC) Troub4dor&3-Spring!Tuesday\nD) qwerty");
        ansB.add("C");

        qsB.add("Two-factor authentication (2FA) protects an account by requiring:");
        optsB.add("A) Two different usernames\nB) A password plus a second verification step, such as a code from an app or text message\nC) Two separate passwords\nD) The user to log in from two different devices at the same time");
        ansB.add("B");

        qsB.add("Why should you keep your operating system and apps up to date?");
        optsB.add("A) Updates make your device look more modern\nB) Updates often include security patches that fix newly discovered vulnerabilities\nC) Updates always add new social media features\nD) Updates are only useful for gaming computers");
        ansB.add("B");

        qsB.add("You see \"https://\" at the start of a website's URL. This means:");
        optsB.add("A) The site is guaranteed to be safe and legitimate\nB) The data sent between your browser and the site is encrypted in transit\nC) The site has been certified by the government\nD) The site cannot contain malware");
        ansB.add("B");

        qsB.add("Which of the following is the safest way to manage many different account passwords?");
        optsB.add("A) Use the same password on every account so you don't forget it\nB) Write all your passwords on a sticky note attached to your monitor\nC) Use a reputable password manager to generate and store unique passwords\nD) Use your birthday and last name on every account");
        ansB.add("C");

        qsB.add("When using public Wi-Fi (e.g., at a coffee shop), the safest practice is to:");
        optsB.add("A) Log in to your online banking immediately to take advantage of the free network\nB) Avoid sensitive activities, or use a reputable VPN to encrypt your traffic\nC) Disable your firewall to improve speed\nD) Share the network password with everyone nearby");
        ansB.add("B");

        qsB.add("Why might it be risky to grant a free flashlight app access to your contacts and microphone?");
        optsB.add("A) The app needs those permissions to turn the flashlight on\nB) Apps can collect and share data they don't actually need, creating a privacy risk\nC) Permissions make the flashlight brighter\nD) There is no risk; permissions are only requested by safe apps");
        ansB.add("B");

        qsB.add("Which of the following is a good rule for sharing personal information online?");
        optsB.add("A) Post your full address and phone number on your social media profile\nB) Share only the minimum information needed and review your privacy settings regularly\nC) Use the same profile picture and bio on every site so people can recognize you\nD) Accept all friend or follower requests, including from strangers");
        ansB.add("B");

        qsB.add("The \"3-2-1\" backup rule recommends keeping:");
        optsB.add("A) 3 copies of your data, on 2 different types of storage media, with 1 copy stored offsite\nB) 3 passwords, 2 usernames, and 1 email account\nC) Backups for 3 days, 2 weeks, and 1 month\nD) 3 antivirus programs running at the same time");
        ansB.add("A");

        qsB.add("If you think your account has been hacked, the first thing you should do is:");
        optsB.add("A) Delete the account immediately\nB) Tell no one and hope the attacker loses interest\nC) Change the password, enable 2FA if available, and review recent activity for unauthorized access\nD) Post about it on social media to warn your friends");
        ansB.add("C");


        // MAIN PROGRAM LOOP

        System.out.println("****************************************************");
        System.out.println("* Welcome to the Cybersecurity Certification Test! *");
        System.out.println("****************************************************");

        String choice = "";

        // this block will run until the user types "3" to exit
        while (!choice.equals("3")) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Take the certification test");
            System.out.println("2. Login as admin");
            System.out.println("3. Exit Program");
            System.out.print("Enter your choice: ");
            choice = in.nextLine();

            // this is the admin menu (Option 2)
            if (choice.equals("2")) {
                System.out.print("Enter admin password: ");
                String pass = in.nextLine();

                if (pass.equals("admin123")) {
                    String admChoice = "";

                    while (!admChoice.equals("3")) {
                        System.out.println("\n--- ADMIN MENU ---");
                        System.out.println("1. Add a question");
                        System.out.println("2. Remove a question");
                        System.out.println("3. Return to Main Menu");
                        System.out.print("Select an option: ");
                        admChoice = in.nextLine();

                        if (admChoice.equals("1")) {
                            System.out.print("Which section? (A or B): ");
                            String sec = in.nextLine().toUpperCase();
                            System.out.print("Enter the question: ");
                            String q = in.nextLine();
                            System.out.println("Enter options format (A) ... B) ... C) ... D) ...): ");
                            String o = in.nextLine();
                            System.out.print("Enter correct answer letter (A, B, C, D): ");
                            String a = in.nextLine().toUpperCase();

                            if (sec.equals("A")) {
                                qsA.add(q); optsA.add(o); ansA.add(a);
                                System.out.println("Successfully added to Part A.");
                            } else if (sec.equals("B")) {
                                qsB.add(q); optsB.add(o); ansB.add(a);
                                System.out.println("Successfully added to Part B.");
                            } else {
                                System.out.println("Invalid section.");
                            }

                        } else if (admChoice.equals("2")) {
                            System.out.print("Which section? (A or B): ");
                            String sec = in.nextLine().toUpperCase();

                            if (sec.equals("A")) {
                                for (int i = 0; i < qsA.size(); i++) {
                                    System.out.println(i + ": " + qsA.get(i));
                                }
                                System.out.print("Enter number to remove: ");
                                int rmIdx = Integer.parseInt(in.nextLine());

                                if (rmIdx >= 0 && rmIdx < qsA.size()) {
                                    qsA.remove(rmIdx); optsA.remove(rmIdx); ansA.remove(rmIdx);
                                    System.out.println("Question removed.");
                                } else {
                                    System.out.println("Invalid ID.");
                                }
                            } else if (sec.equals("B")) {
                                for (int i = 0; i < qsB.size(); i++) {
                                    System.out.println(i + ": " + qsB.get(i));
                                }
                                System.out.print("Enter ID to remove: ");
                                int rmIdx = Integer.parseInt(in.nextLine());

                                if (rmIdx >= 0 && rmIdx < qsB.size()) {
                                    qsB.remove(rmIdx); optsB.remove(rmIdx); ansB.remove(rmIdx);
                                    System.out.println("Question removed.");
                                } else {
                                    System.out.println("Invalid ID.");
                                }
                            }
                        } else if (!admChoice.equals("3")) {
                            System.out.println("Invalid admin option.");
                        }
                    }
                } else {
                    System.out.println("Incorrect password! Access denied.");
                }

                // EXIT PROGRAM (Option 3)
            } else if (choice.equals("3")) {
                System.out.println("Thank you for using the Cybersecurity Certification system. Goodbye!");

                // TAKE THE TEST (Option 1)
            } else if (choice.equals("1")) {
                int scoreA = 0;
                int scoreB = 0;
                int errA = 0;
                int errB = 0;

                ArrayList<Integer> usedA = new ArrayList<Integer>();
                ArrayList<Integer> usedB = new ArrayList<Integer>();

                System.out.println("\n=============================================");
                System.out.println("  PART A: Recognizing Cyber Threats");
                System.out.println("=============================================");
                int qNumA = 0;

                // Runs until 6 questions are asked, OR naturally stops if errors exceed 2
                while (qNumA < 6 && errA <= 2) {
                    int rIdx = -1;
                    int match = 1;

                    // searches for a question that hasn't been asked yet
                    while (match > 0) {
                        rIdx = (int)(Math.random() * qsA.size());
                        match = 0;
                        for (int j = 0; j < usedA.size(); j++) {
                            if (usedA.get(j) == rIdx) {
                                match++;
                            }
                        }
                    }
                    usedA.add(rIdx);

                    System.out.println("\nQ" + (qNumA + 1) + ": " + qsA.get(rIdx));
                    System.out.println(optsA.get(rIdx));

                    String ans = "";
                    // this forces correct input format
                    while (!ans.equals("A") && !ans.equals("B") && !ans.equals("C") && !ans.equals("D")) {
                        System.out.print("Your answer (A, B, C, D): ");
                        ans = in.nextLine().toUpperCase();
                    }

                    if (ans.equals(ansA.get(rIdx))) {
                        System.out.println("Correct!");
                        scoreA++;
                    } else {
                        System.out.println("Incorrect. The correct answer was " + ansA.get(rIdx));
                        errA++;
                    }
                    qNumA++;
                }

                // Move to Part B only if they haven't mathematically failed
                if (errA <= 2) {
                    System.out.println("\n=============================================");
                    System.out.println("  PART B: Online Privacy & Safe Practices");
                    System.out.println("=============================================");
                    int qNumB = 0;

                    // Checks B's specific limit and the overall combined test limit
                    while (qNumB < 6 && errB <= 2 && (errA + errB) <= 3) {
                        int rIdx = -1;
                        int match = 1;

                        while (match > 0) {
                            rIdx = (int)(Math.random() * qsB.size());
                            match = 0;
                            for (int j = 0; j < usedB.size(); j++) {
                                if (usedB.get(j) == rIdx) {
                                    match++;
                                }
                            }
                        }
                        usedB.add(rIdx);

                        System.out.println("\nQ" + (qNumB + 1) + ": " + qsB.get(rIdx));
                        System.out.println(optsB.get(rIdx));

                        String ans = "";
                        while (!ans.equals("A") && !ans.equals("B") && !ans.equals("C") && !ans.equals("D")) {
                            System.out.print("Your answer (A, B, C, D): ");
                            ans = in.nextLine().toUpperCase();
                        }

                        if (ans.equals(ansB.get(rIdx))) {
                            System.out.println("Correct!");
                            scoreB++;
                        } else {
                            System.out.println("Incorrect. The correct answer was " + ansB.get(rIdx));
                            errB++;
                        }
                        qNumB++;
                    }
                }


                // FINAL SCORING
                System.out.println("\n======================================");
                System.out.println("           FINAL TEST RESULTS         ");
                System.out.println("======================================");

                // If errors exceeded the limits, the while loops stopped early
                if (errA > 2 || errB > 2 || (errA + errB) > 3) {
                    System.out.println("Status: FAILED");
                    System.out.println("The test was terminated early because you missed too many questions to pass.");
                } else {
                    int totalScore = scoreA + scoreB;
                    System.out.println("Part A Score: " + scoreA + " / 6");
                    System.out.println("Part B Score: " + scoreB + " / 6");
                    System.out.println("Total Score:  " + totalScore + " / 12");

                    // Double check passing requirements (4 in A, 4 in B, 9/12 overall)
                    if (scoreA >= 4 && scoreB >= 4 && totalScore >= 9) {
                        System.out.println("\nStatus: PASSED");
                        System.out.println("Congratulations! You have earned your Cybersecurity Certification.");
                    } else {
                        System.out.println("\nStatus: FAILED");
                        System.out.println("Unfortunately, you did not meet the requirements to pass.");
                    }
                }
                System.out.println("======================================");

            } else {
                System.out.println("Invalid option. Please enter 1, 2, or 3.");
            }
        }

        in.close();
    }
}