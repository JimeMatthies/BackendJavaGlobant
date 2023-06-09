Algoritmo Encuentro4Ejercicio6
	
	//En medio de la auditor�a interna, el equipo est� cubriendo a un compa�ero de trabajo que est� de licencia.
	//Su compa�ero de trabajo ha dejado un mensaje con las tareas a	realizar.
	//"�Hola! Muchas gracias por cubrirme. Lo principal que debes hacer es completar la hoja de c�lculo de ingresos mensuales.
	//Puedes hacerlo buscando los �ltimos ingresos publicitarios en los informes de marketing. Despu�s de hacer todo eso, 
	//revisa mi correo electr�nico y si hay menos de 10 correos sin leer revisa mi correo de voz para ver si hay alguna 
	//solicitud de los ejecutivos. Si hay tales solicitudes, h�galas primero a menos que tenga una solicitud de emergencia de otro
	//departamento. Una vez que hayas terminado con la solicitud de cumplimiento, riegue la planta de mi escritorio despu�s
	//de apagar la computadora. Ah, espera, deber�a haber mencionado un par de cosas: debes iniciar sesi�n con usuario de 
	//administrador para ver los informes de marketing, y tendr�s que enviarme un correo electr�nico de actualizaci�n justo 
	//despu�s de que termines de manejar las solicitudes. Bueno, gracias de nuevo. �Es de gran ayuda! Te debo el almuerzo cuando regrese." 
	//Nuestra tarea ser� imprimir por pantalla la lista de tareas en el orden que corresponden para que luego las podamos realizar.
	//�Te animas a colocar las tareas en el orden correcto? Para hacer esto, debes crear en PSeInt la cantidad de variables
	//que creas correctas y asignarles valor.Por ejemplo: cantidadEmails = 6, solicitudesEjecutivos = 3
	
	Definir ingresosPublicidad, solicitudesEjecutivos, solicitudEmergencia Como Logico
	Definir emailsSinLeer Como Entero
	
	Escribir "Iniciar secion con usuario de administrador"
	Escribir "Existen ingresos publicitarios en los informes de Marketing? (verdadero o falso)"
	Leer ingresosPublicidad
	
	Si ingresosPublicidad == Verdadero Entonces
		Escribir "Completar la hoja de c�lculo de ingresos mensuales."
	Fin Si
	
	Escribir "Ingrese la cantidad de correos sin leer:"
	Leer emailsSinLeer
	
	Si emailsSinLeer < 10 Entonces
		Escribir "Revisar el buzon de voz. Existen solicitudes de los ejecutivos? (verdadero o falso)"
		Leer solicitudesEjecutivos
		Escribir "Existen solicitudes de emergencia? (verdadero o falso)"
		Leer solicitudEmergencia
		Si solicitudEmergencia = Verdadero Entonces
			Escribir "Cumplir las solicitudes de emergencia"
			Escribir "Enviar email de actualizaci�n"
		SiNo
			Si solicitudesEjecutivos = Verdadero Entonces
				Escribir "Cumplir las solicitudes de los ejecutivos"
				Escribir "Enviar email de actualziaci�n"
			Fin Si
		Fin Si
	SiNo
		Escribir "Revisar correo electronico"
	Fin Si
	
	Escribir "Apagar el pc y regar las plantas."
	
FinAlgoritmo
