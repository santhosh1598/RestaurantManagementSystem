@echo off
rem Maven wrapper script for Windows

setlocal

set MAVEN_HOME=%~dp0\.mvn\wrapper
set MAVEN_OPTS=-Xmx1024m

if not exist "%MAVEN_HOME%\mvnw.cmd" (
    echo "Maven wrapper script not found."
    exit /b 1
)

call "%MAVEN_HOME%\mvnw.cmd" %*
exit /b %ERRORLEVEL%