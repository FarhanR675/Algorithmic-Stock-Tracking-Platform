# Algorithmic Stock Tracking Platform

## Description
A back-end platform designed to track stock prices and provide key financial metrics. This project integrates with the Alpha Vantage API to fetch real-time global stock quotes, and utilizes Java, JavaFX, HttpServer, PostgreSQL, and JUnit to deliver a robust and efficient stock tracking solution.

## Table of Contents
1. [Installation](#installation)
2. [Usage](#usage)
3. [Features](#features)
4. [Technologies Used](#technologies-used)
5. [Future Updates](#future-updates)
6. [Contributing](#contributing)
7. [License](#license)
8. [Contact](#contact)

## Installation

1. Clone the repository:
    ```
    git clone https://github.com/FarhanR675/algorithmic-stock-tracking-platform.git
    ```

2. Navigate to the project directory:
    ```sh
    cd algorithmic-stock-tracking-platform
    ```

3. Set up PostgreSQL:
    - Ensure PostgreSQL is installed and running on your system.
    - Create a database named `stock_tracking`.
    - Update the database connection settings in the project configuration file.

4. Install dependencies:
    ```sh
    ./install-dependencies.sh
    ```

## Usage

1. Start the server:
    ```sh
    ./start-server.sh
    ```

2. Access the API:
    - Use the console based options when starting the server or Use Postman or your browser to navigate to `http://localhost:8080/api/v1/stocks`

3. Example API requests:
    - To get stock data for a specific symbol using Postman:
        ```sh
        Postman - GET "http://localhost:8080/api/v1/stocks/{symbol}"
        ```

## Features

- **Real-time Stock Quotes:** Integrated with Alpha Vantage API to fetch up-to-date stock information.
- **Financial Metrics Calculation:** Calculates VWAP and True Range for selected stocks, providing valuable insights into stock price movements.
- **User Options:** Allows users to select specific stock symbols and retrieve relevant financial metrics.
- **Database Management:** Efficient PostgreSQL database schema for fast and reliable data querying.

## Technologies Used

- **Programming Languages:** Java, SQL
- **Frameworks and Tools:** Maven, JUnit, JavaFX
- **Databases:** PostgreSQL
- **Other:** Git, API Integration, Json

## Future Updates

- **User Interface:** Plan to implement a UI to give the users a more application based program.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any bugs or feature requests.

## License

This project is licensed under the MIT License.

## Contact

Farhan Rahman - [farhanrahman675@gmail.com](mailto:farhanrahman675@gmail.com)

---
