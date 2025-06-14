# Security Policy

## Project: Currency Converter

The **Currency Converter** is a simple multi-layered desktop application developed to convert between **Euro (EUR)**, **US Dollar (USD)**, and **Tunisian Dinar (TND)**. This project was built to explore user input handling, modular code organization, and arithmetic logic — all within a practical and educational context.

---

## Supported Versions

| Version | Supported |
|---------|-----------|
| 1.x     | ✅ Yes     |
| < 1.0   | ❌ No      |

---

## Reporting a Vulnerability

Security is important, even for small educational projects. If you identify a vulnerability or potential issue, please report it by providing:

- A detailed description of the issue
- Steps to reproduce the behavior
- Any suggested fix (if available)

Contact: **security@yourdomain.com** (replace with your actual contact)

---

## Security Considerations

### 1. **Input Validation**
- User inputs are validated to ensure they are numeric and within acceptable bounds.
- Invalid or unexpected inputs (e.g., non-numeric values, empty fields) are gracefully handled to prevent application crashes.

### 2. **Arithmetic Safety**
- Checks are in place to avoid arithmetic errors (e.g., division by zero or floating-point anomalies).
- Calculations are accurate and limited to known supported currency pairs.

### 3. **Isolation of Logic**
- Core conversion logic is separated from the user interface to prevent code injection or UI manipulation risks.
- Code modularity enhances review and debugging processes, reducing potential for logical bugs.

### 4. **No Network Dependency**
- The current version uses hardcoded or simulated exchange rates for conversion.
- There is no real-time data fetched from external APIs, which reduces exposure to network-related security issues.

---

## Future Security Enhancements

When connecting to real-time currency APIs or expanding the application:

- Use **HTTPS** for secure data transmission.
- Validate and sanitize all external data sources.
- Implement proper error handling for network failures or unexpected responses.
- Add rate-limiting and caching mechanisms if deployed in a networked environment.

---

## Disclaimer

This project is an **educational prototype** and does not guarantee financial accuracy or compliance with real-world financial regulations. It is not intended for professional or commercial financial applications.

If you plan to use or modify this application for production or public use, you are responsible for ensuring it meets all relevant security, accuracy, and compliance requirements.

---
