from py4j.java_gateway import JavaGateway

class Calculator:
    def add(self, a, b):
        return a + b

# Запускаем сервер Py4J
gateway = JavaGateway()  # Соединение с Java
gateway.entry_point.setCalculator(Calculator())
