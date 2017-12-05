insert into clasificacion values(1,'EY-01-','Mobiliario',false),
								(2,'EY-02-','Comunicación',false),
                                (3,'EY-03-','Foto y Video',false),
                                (4,'EY-04-','A/C',false),
                                (5,'EY-05-','Comunicación 2',false),
                                (6,'EY-06-','Audiovisuales',false),
                                (7,'EY-07-','Diverso',false),
                                (8,'EY-10-','Transporte',false);

select * from clasificacion;

select max(idproductos) as idproductos from productos;

insert into status values(1,'Activo'),
						 (2,'Baja'),
                         (3,'Comodato'),
                         (4,'Donación');
					
select * from status;

select * from productos;

insert into productos values(1,0001,'A','Teclado','Teclado PC','Genius','RSX','0123456789',
					        'Negro','','',12/12/12,'2345',100.00,'Si sirve',3,0,null,null,1,1)