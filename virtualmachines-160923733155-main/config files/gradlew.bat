@rem Gradle wrapper script for Windows
@rem Project: Virtual Machines Management System  
@rem Author: abdul ahad
@rem Student ID: 160923733155

@echo off
@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

echo Starting Gradle Wrapper for project 160923733155 by abdul ahad

@rem Check java installation
java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo Java could not be found
    echo Please install Java 24 or higher
    exit /b 1
)

@rem Set GRADLE_USER_HOME
if not defined GRADLE_USER_HOME set "GRADLE_USER_HOME=%USERPROFILE%\.gradle"

@rem Execute Gradle
java -classpath "gradle\wrapper\gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain %*

if "%OS%"=="Windows_NT" endlocal