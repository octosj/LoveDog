SELECT H_NAME, H_ADDRESS,H_PHONE, H_MAIL, H_REGI
		FROM HOSPITAL;
		
		SELECT U_ID, U_PASSWORD, U_NAME, U_EMAIL, U_PHONE, U_ENABLE, U_AUTH, F_NAME
 FROM USER_U
 	
 
INSERT INTO USER_U (U_ID, U_PASSWORD, U_NAME, U_EMAIL, U_PHONE, U_ENABLE, U_AUTH, F_NAME) 
VALUES('h', 'h', 'h', 'h', 'h','Y','H',null);

UPDATE USER_U
 SET U_AUTH='H'
  WHERE U_ID='user';
  
 INSERT INTO HOSPITAL(H_NAME,H_ADDRESS,H_PHONE,H_MAIL,H_REGI,U_ID,H_ENABLE,MAIN_OBJ,MAIN_ANI)
     VALUES('h', 'h', '01025846959', 'h@h.com', '123123123123',  'user', 'Y','abc','zxc');