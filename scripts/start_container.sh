#!/bin/bash
set -e

# Pull the Docker image from Docker Hub
docker pull basith321/demoapp

# Run the Docker image as a container
docker run -d -p 8000:8000 basith321/demoapp