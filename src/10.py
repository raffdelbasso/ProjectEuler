import sympy
primo = 2
somma = 0
while (primo<=2000000):
	somma+=primo
	primo=sympy.nextprime(primo)
print(somma)