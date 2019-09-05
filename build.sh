#!/bin/bash

export ROOT_FOLDER
ROOT_FOLDER=$(pwd)

export GRADLE_USER_HOME="${ROOT_FOLDER}/.gradle"

chmod +x gradlew
./gradlew clean build