INSERT INTO public.estado (nombre_estado)
VALUES ('ACTIVO'),
       ('CANCELADO'),
       ('INACTIVO'),
       ('COMPLETADO');
ALTER TABLE public.tipo_servicio DROP CONSTRAINT tipo_servicio_nombre_tipo_servicio_check;
INSERT INTO public.tipo_servicio (nombre_tipo_servicio)
VALUES ('SPA'),
       ('CUARTO'),
       ('BEBIDAS'),
       ('LICOR'),
       ('SHOWS'),
       ('COMIDAS');
INSERT INTO public.tipo_afiliado (nombre_tipo_afiliado)
VALUES ('HOTELES'),
       ('RESTAURANTES');
INSERT INTO public.afiliado (estado_afiliado_fk, tipo_afiliado_fk, codigo_afiliado, nombre_afiliado)
VALUES (1, 1, 'H001', 'Hotel Sol'),
       (1, 1, 'H002', 'Hotel Luna'),
       (1, 1, 'H003', 'Hotel Estrella'),
       (1, 2, 'R001', 'Restaurante La Esquina'),
       (1, 2, 'R002', 'Restaurante Del Mar'),
       (1, 2, 'R003', 'Restaurante Gourmet');

INSERT INTO public.servicio (codigo_servicio, nombre_servicio, costo_servicio, tipo_servicio_fk)
VALUES
    ('S001', 'Spa Relax', 120.00, 1),
    ('S002', 'Habitación Doble', 250.00, 2),
    ('S003', 'Bebidas Refrescantes', 30.00, 3),
    ('S004', 'Spa Deluxe', 150.00, 1),
    ('S005', 'Suite Presidencial', 500.00, 2),
    ('S006', 'Cocteles', 40.00, 3),
    ('S007', 'Masaje Corporal', 100.00, 1),
    ('S008', 'Habitación Individual', 180.00, 2),
    ('S009', 'Bar Abierto', 50.00, 3);

INSERT INTO public.servicio (codigo_servicio, nombre_servicio, costo_servicio, tipo_servicio_fk)
VALUES ('S010', 'Cena Gourmet', 70.00, 6),
       ('S011', 'Show en Vivo', 100.00, 5),
       ('S012', 'Bebidas Exóticas', 35.00, 3),
       ('S013', 'Menú Especial', 90.00, 6),
       ('S014', 'Espectáculo Musical', 120.00, 5),
       ('S015', 'Licores Importados', 60.00, 4),
       ('S016', 'Almuerzo Buffet', 60.00, 6),
       ('S017', 'Teatro Cena', 110.00, 5),
       ('S018', 'Selección de Vinos', 45.00, 4);


INSERT INTO public.afiliado_servicio (afiliado_fk, codigo_afiliado, codigo_servicio, servicio_fk)
VALUES ('H001', 'H001', 'S001', 'S001'),
       ('H001', 'H001', 'S002', 'S002'),
       ('H001', 'H001', 'S003', 'S003'),
       ('H002', 'H002', 'S004', 'S004'),
       ('H002', 'H002', 'S005', 'S005'),
       ('H002', 'H002', 'S006', 'S006'),
       ('H003', 'H003', 'S007', 'S007'),
       ('H003', 'H003', 'S008', 'S008'),
       ('H003', 'H003', 'S009', 'S009'),
       ('R001', 'R001', 'S010', 'S010'),
       ('R001', 'R001', 'S011', 'S011'),
       ('R001', 'R001', 'S012', 'S012'),
       ('R002', 'R002', 'S013', 'S013'),
       ('R002', 'R002', 'S014', 'S014'),
       ('R002', 'R002', 'S015', 'S015'),
       ('R003', 'R003', 'S016', 'S016'),
       ('R003', 'R003', 'S017', 'S017'),
       ('R003', 'R003', 'S018', 'S018');
