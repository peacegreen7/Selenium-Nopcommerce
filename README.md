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

## 2. Setup and Configuration for Selenium Grid

### Step 1: Install Docker
1. Download and install Docker:
* macOS/Linux: Use Docker Desktop.
* Windows: Install Docker Desktop for Windows.

2. Verify the installation by running:
```bash
docker --version
```
### Step 2: Create a docker-compose.yml for Selenium Grid
### Step 3: Start Selenium Grid
1. Navigate to the directory where the docker-compose.yml file is located.
2. Run the following command:
```bash
docker-compose up -d
```
3. Verify that the hub and nodes are running:
* Open http://localhost:4444 in browser.

### Step 4: Integrate with Jenkins
1. Add Docker to Jenkins:
- Install Docker on the Jenkins server.
- Install the "Docker" and "Pipeline" plugins in Jenkins.

2. Create a Jenkins Pipeline Job:

3. Run the pipeline to execute tests on Selenium Grid.
- Open http://localhost:8080
