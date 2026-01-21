# Apache Kafka with Spring Boot - Hands-On Examples

This repository provides **hands-on Kafka examples** using **Spring Boot**, covering producers, consumers, topics, partitions, and common messaging patterns.

---

## Prerequisites

- Java 17+  
- Maven 3.8+  
- Local Kafka & Zookeeper running  

---

## Quick Start

### Run Producer
```bash
cd producer
mvn spring-boot:run

Run Consumer
cd consumer
mvn spring-boot:run


The producer sends messages to Kafka topics; the consumer reads and logs them.

Project Structure
producer/   # Spring Boot producer application
consumer/   # Spring Boot consumer application

Features

Kafka Producer & Consumer

Topics & Partitions management

Consumer Groups

Messaging patterns: Publish-Subscribe
