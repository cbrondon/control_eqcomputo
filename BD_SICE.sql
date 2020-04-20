create database Proyecto;
use Proyecto;

-- drop database Proyecto;

create table Usuario(   
 nombre varchar(20) not null ,
 tipo varchar(7) not null, 
 numtrabajo varchar(5),
 correo varchar(50),
 tel varchar(10),
 contraseña varchar(30),
 primary key (numtrabajo)
 );

create table Tecnico(
 num varchar(5)primary key ,
 foreign key(num) references Usuario(numtrabajo) on delete cascade on update cascade
 );
 
 create table Jefe(
 num varchar(5)primary key ,
 foreign key(num) references Usuario(numtrabajo) on delete cascade on update cascade
 );

create table Departamento(
 id varchar(5) , 
 nomdpto varchar(10),
 jefe varchar(20),
 primary key (id, jefe),
 foreign key (jefe) references Jefe(num)
 )
 ;
 create table Equipo(
 numinvent varchar(5),     
 estado varchar(2) not null, -- sirve "si" o "no".
 numserie varchar(10),
 ram varchar(2),
 rom varchar(3),  
 procesador varchar(10),
 marca varchar(10),
 dpto varchar(5) not null,
 primary key (numinvent, dpto),
 foreign key (dpto) references Departamento(id)
 ) ;
 
-- drop table Mantenimiento;
create table Mantenimiento(
id int not null auto_increment,
tecnico varchar(5),
equipo varchar(5),  
fecha date,
dpto varchar(5),
primary key (id,equipo, dpto),
foreign key(tecnico) references Tecnico(num) on delete cascade on update cascade,
foreign key(equipo) references Equipo(numinvent) on delete cascade on update cascade,
foreign key(dpto) references Departamento(id) on delete cascade on update cascade
 );

-- select * from RealizaMntto;
  
create table RealizaMntto(
idtecnico varchar(5),
idmntto int,
idrealiza varchar(5),
primary key (idtecnico, idmntto, idrealiza),
foreign key (idmntto) references Mantenimiento (id),
foreign key (idtecnico) references Tecnico (num)
);
 
-- select * from  Usuario;
 
 insert into Usuario  (nombre, tipo, numtrabajo, correo, tel, contraseña) values ('Juan Perez', 'Tecnico', '84759', 'Juanperez@gmail.com', '8331425687', 'hfbrtgv'),
                                                                                  ('Rosa Martinez', 'Jefe', '87829', 'RositaFresita@gmail.com', '8338996547', 'gcyuerbfvygv'),
							                                                      ('Ruben Contreras', 'Tecnico', '47245', 'RubenInge@gmail.com', '8331254789', 'gsvcygevcv'),
							                                                      ('Rosario Calderon', 'Tecnico', '78759', 'CalderonSa@gmail.com', '8334786954', 'duhcbfsruev'),
						                                                          ('Jorge Ramirez', 'Tecnico', '78959', 'JrgeCurioso@gmail.com', '8335632147', 'cyedvbfchd'),
                                                                                  ('Dario Gonzalez', 'Tecnico', '41256', 'DarioGnzlz@gmail.com', '8337894152', 'vdtyevft'),
                                                                                  ('Maria Gutierrez', 'Tecnico', '36547', 'MariadelosAngeles@gmail.com', '8332547896', 'wtyoipy'),
                                                                                  ('Marilyn Manson', 'Jefe', '84666', 'MarilynManson@gmail.com', '8331234567', 'metal666'),
                                                                                  ('Yamary Sanchez', 'Jefe', '15748', 'YamarySanchez@gmail.com', '8334561236', 'hbfvhrbth'),
                                                                                  ('Brandon Velazquez', 'Jefe', '36987', 'Branfrut@gmail.com', '8331874596', 'wbhebvr');

insert into Tecnico (num) values ('84759'),
								 ('47245'),
                                 ('78759'),
                                 ('78959'),
                                 ('41256'),
                                 ('36547');
                                 
insert into Jefe (num) values    ('87829'),
								 ('84666'),
                                 ('78759'),
                                 ('15748'),
                                 ('36987');
                                                                 

insert into Departamento(id, nomdpto, jefe) values ('1', 'sistemas', '87829'), 
											 ('2', 'quimica', '87829'),
                                             ('3', 'industrial', '78759'),
                                             ('4', 'mecanica', '78759'),
                                             ('5', 'gestion', '36987' ),
                                             ('6', 'petrolera', '36987'),
                                             ('7', 'electrica', '15748'),
                                             ('8', 'electronic','15748'),
                                             ('9', 'admin','84666'),
                                             ('10', 'bibl', '84666');
-- select * from Usuario;
					
      insert into Equipo (numinvent, estado, numserie, ram, rom, procesador, marca, dpto) values ('25455', 'si', '2168498615','8' , '128', 'amd', 'asus' , '1'),
					                                                                             ('86075', 'no', '8136825889','8' , '256', 'intel', 'hp', '3'),
                                                                                                 ('79014',  'si','4798478518','4' , '128', 'amd' , 'dell', '8'),
                                                                                                 ('12469',  'no','8965995665','8' , '128',  'amd', 'dell', '7'),
                                                                                                 ('96325',  'si','8557156945','4' , '256', 'intel', 'lenovo', '2'),
                                                                                                 ('96317',  'si','7369142585','8' , '256', 'nvidia','hp' , '4'),
																							     ('89069',  'si','5956255555','8' , '128',  'amd', 'dell', '6'),
                                                                                                 ('19325',  'si','8557156945','8' , '256', 'amd', 'asus', '10'),
                                                                                                 ('24214',  'si','6848278518','4' , '128', 'intel' , 'hp', '5'),
						                                                                         ('47036',  'no','3647478518','4' , '256', 'amd' , 'lenovo', '9');               
   insert into Mantenimiento(id,tecnico,equipo,fecha,dpto) values ('555', null, '47036','2020-04-18','9');

   insert into Mantenimiento(id, tecnico, equipo, fecha, dpto) values ('478', '84759','86075', '2020-04-15', '3'),
																	  ('784', '41256', '12469', '2020-04-22', '7'),
                                                                      ('365', '36547', '47036','2020-04-18','9');
                                                                      
                                                                      
                             
delimiter //
create procedure añadir_equipo(
inventNumero varchar(5),
estado varchar(2),
numeroSerie varchar(10),
memRam  varchar(2),
memRom varchar(3),
procesador varchar(10),
marca varchar(10),
depto varchar(5),
out mensaje varchar (30)
)

Begin

 DECLARE EXIT HANDLER FOR SQLEXCEPTION
 BEGIN 
 SHOW ERRORS LIMIT 1;
 ROLLBACK;
 END; 
 
 DECLARE EXIT HANDLER FOR SQLWARNING
 BEGIN
 SHOW WARNINGS LIMIT 1;
 ROLLBACK;
 END;

START TRANSACTION;
-- set @retVal = (select counT(*) FROM PARTICIPANTE WHERE teamid=id_e );

   
   if exists (select * from Equipo where inventNumero=numinvent) then
	set mensaje = "El equipo ya existe";
   else 
	insert into Equipo values(inventNumero, estado, numeroSerie, memRam, memRom,procesador,marca,depto);
	set mensaje="Equipo registrado"; 
	end if;

 
commit;

end//

delimiter ;


delimiter //
create procedure ingresar(
email varchar(50),
password varchar(30),
out mensaje varchar (30)
)

Begin

 DECLARE EXIT HANDLER FOR SQLEXCEPTION
 BEGIN 
 SHOW ERRORS LIMIT 1;
 ROLLBACK;
 END; 
 
 DECLARE EXIT HANDLER FOR SQLWARNING
 BEGIN
 SHOW WARNINGS LIMIT 1;
 ROLLBACK;
 END;

START TRANSACTION;
-- set @retVal = (select counT(*) FROM PARTICIPANTE WHERE teamid=id_e );

   
   if exists (select * from usuario where email=correo and password=contraseña) then
	set mensaje = "true";
   else 
	set mensaje="No válido"; 
	end if;

 
commit;

end//

delimiter ;
					

delimiter //
create procedure mostrarequipos(
eq varchar(5),
fech date,
depto varchar(5),
out mensaje varchar (30)
)

Begin

 DECLARE EXIT HANDLER FOR SQLEXCEPTION
 BEGIN 
 SHOW ERRORS LIMIT 1;
 ROLLBACK;
 END; 
 
 DECLARE EXIT HANDLER FOR SQLWARNING
 BEGIN
 SHOW WARNINGS LIMIT 1;
 ROLLBACK;
 END;

START TRANSACTION;
-- set @retVal = (select counT(*) FROM PARTICIPANTE WHERE teamid=id_e );

   insert into mantenimiento(tecnico,equipo,fecha,dpto) values (null,eq,fech,depto);
 -- insert into mantenimiento(tecnico,equipo,fecha,dpto) values (null, '25455','2020-04-29','1');
 
commit;

end//

delimiter ;		
