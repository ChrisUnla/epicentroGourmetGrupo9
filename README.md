Pablo, ahi te comente en el archivo cfg las posibles opciones para que funcione el hibernate.cfg
proba reemplazando la linea comentada con la de arriba:
1- solo la de la URL de hibernate
2- sumale la conexion a la base de datos (3306 del localhost es por defecto, chuequea si es el mismo en tu MYSQL)

Si no te funcionan estos cambios, decime que error te tira al costado de la linea.

Si el hibernate.cfg.xml funciona (junto con el TestHBM) pero los demas mapeos 
te dan error, tenes que ir a la barra de Eclipse en:
  Window -> Preferences -> XML -> Habilita los 2 checkbox (en especial: "Download external resource....")
