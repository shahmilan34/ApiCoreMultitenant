package com.factelcore.enumeration;

public enum FuncionalidadTypes {
	
	REGISTRACION ("REGISTRACION", 0, "P" ),
	ADMINISTRACION ("ADMINISTRACION", 0,"P" ),
	SOLICITUDES ("SOLICITUDES", 0,"P" ),
	GENERALES ("GENERALES", 0,"P" ),
	TRAMITACION ("TRAMITACION", 0,"P" ),
	CONSULTAS ("CONSULTAS", 0,"P" ),
	ESPECIALES ("ESPECIALES", 0,"P" ),
	CONSULTA_DE_ESTADO ("CONSULTA DE ESTADO", 1,"H" ),
	MODIFIACION_DE_DATOS ("	MODIFIACION DE DATOS", 1,"H" ),
	BAJA ("BAJA", 1,"H" ),
	SEGURIDAD_DE_ARCHIVOS ("SEGURIDAD DE ARCHIVOS", 1,"H" ),
	AMINISTRACION_USUARIOS ("AMINISTRACION USUARIOS", 2,"H" ),
	ADMINISTRACION_CLIENTES ("ADMINISTRACION CLIENTES", 2,"H" ),
	SOLICITUDES_HIJO("SOLICITUDES HIJO", 3,"H" ),
	DESCARGA_DE_ARCHIVOS ("DESCARGA DE ARCHIVOS", 3,"H" ),
	CAMBIO_DE_CONSTRASEÑA ("CAMBIO DE CONSTRASEÑA", 4,"H" ),
	CAMBIO_DE_PREGUNTA ("CAMBIO DE PREGUNTA", 4,"H" ),
	SOLICITAR_REEMITIR_CERTIFICADOS ("SOLICITAR REEMITIR CERTIFICADOS", 4,"H" ),
	ADM_OPERADORES ("ADM OPERADORES", 5,"H" ),
	ADM_FUNCIONALIDADES ("ADM FUNCIONALIDADES", 5,"H" ),
	ADM_PERFILES ("ADM PERFILES", 5,"H" ),
	ADM_PERFILES_FUNCIONALIDADES ("ADM PERFILES FUNCIONALIDADES", 5,"H" ),
	ADM_PERFILES_OPERADORES ("ADM PERFILES OPERADORES", 5,"H" ),
	ADM_CAUSAL ("ADM CAUSAL", 5,"H" ),
	SOLICITUDES_A_PROCESAR ("SOLICITUDES A PROCESAR", 6,"H" ),
	CANCELACIONES_Y_BAJAS ("CANCELACIONES Y BAJAS", 6,"H" ),
	UNIR_CLIENTES ("UNIR CLIENTES", 6,"H" ),
	SOLICITUDES_DE_CERTIFICADO ("SOLICITUDES DE CERTIFICADO", 6,"H" ),
	TODAS_LAS_SOLICITUDES ("TODAS LAS SOLICITUDES", 7,"H" ),
	SOLICITUDES_POR_CAUSAL ("SOLICITUDES POR CAUSAL", 7,"H" ),
	POR_USUARIO ("POR USUARIO", 7,"H" ),
	SOLICITUDES_INFORMACION ("SOLICITUDES INFORMACION", 7,"H" ),
	BAJA_FISICA_DE_SERVICIO ("BAJA FISICA DE SERVICIO", 8,"H" ),
	MODIFICACION_DE_DATOS ("MODIFICACION DE DATOS", 8,"H" ),
	RESETEAR_CONSTRASEÑA ("RESETEAR CONSTRASEÑA", 8,"H" ),
	ADMINISTRACION_USUARIOS_HIIJOS ("ADMINISTRACION USUARIOS HIIJOS", 8,"H" ),
	ADMINISTRACION_SOLICITUDES_INFORMACION ("ADMINISTRACION SOLICITUDES INFORMACION", 8,"H" ),
	USUARIO_PORTAL ("USUARIO PORTAL", 8,"H" );
	
	private String name;
	private int value;
	private String tipo;
	
	private FuncionalidadTypes( String name, int i, String tipo ) 
	{	
		this.name = name;
		this.value = i;
		this.tipo = tipo;
	}

	public String getNaem() {
		return name;
	}

	public int getValue() {
		return value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public static String looktypeNod( String nameFuncionaldiad )
	{
		String valuetipo = "";
		for ( FuncionalidadTypes f : FuncionalidadTypes.values())
		{
			if ( f.name.equals(nameFuncionaldiad) )
				valuetipo = f.getTipo();
		}
		return valuetipo;
	}
}