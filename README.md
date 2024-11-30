# Nopcommerce Project

## 1. Project Structure

 Below is a standard structure for an automation framework using Selenium, TestNG, Maven, Selenium Grid (via Docker), and Jenkins for CI/CD.

```markdown
src/
├── main/
│   ├── java/
│   │   ├── base/                     # Base classes (e.g., DriverManager)
│   │   ├── pages/                    # Page Object Model classes
│   │   ├── utils/                    # Utilities (e.g., logger, config reader, helpers)
│   │   ├── constants/                # Constant values (URLs, credentials, etc.)
│   │   └── exceptions/               # Custom exceptions (if needed)
│   └── resources/                    # Resources for main code (e.g., properties, Log4j configs)
│       ├── config.properties         # Global configuration file
│       ├── log4j2.xml                # Log configuration
│       └── ...
├── test/
│   ├── java/
│   │   ├── tests/                    # Test cases
│   │   ├── listeners/                # TestNG listeners
│   │   ├── hooks/                    # Hooks for pre/post actions (e.g., TestNG @BeforeSuite)
│   │   └── runners/                  # Runners for executing test suites
│   └── resources/                    # Resources for tests (e.g., test data files)
│       ├── testng.xml                # TestNG configuration
│       └── data/
├── reports/                          # Test reports (e.g., HTML, screenshots)
│   ├── screenshots/                  # Screenshots for failed tests
│   └── ...
├── logs/                             # Log files
├── pom.xml                           # Maven configuration file
├── Dockerfile                        # Dockerfile for CI/CD pipeline
└── Jenkinsfile                       # Pipeline file for Jenkins 
```

