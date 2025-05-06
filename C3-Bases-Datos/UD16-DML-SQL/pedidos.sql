CREATE TABLE
    PEDIDOS (
        NÚMERO_DE_PEDIDO DOUBLE,
        CÓDIGO_CLIENTE VARCHAR(10),
        FECHA_DE_PEDIDO VARCHAR(10),
        FORMA_DE_PAGO VARCHAR(10),
        DESCUENTO DOUBLE,
        ENVIADO VARCHAR(10)
    );

INSERT INTO
    PEDIDOS (
        NÚMERO_DE_PEDIDO,
        CÓDIGO_CLIENTE,
        FECHA_DE_PEDIDO,
        FORMA_DE_PAGO,
        DESCUENTO,
        ENVIADO
    )
VALUES
    (1, 'CT01', '11/03/2000', 'CONTADO', 0.02, 'TRUE'),
    (3,'CT23', '18/03/2000', 'APLAZADO',0.06,'FALSE'),
    (5, 'CT25', '31/03/2000', 'CONTADO', 0.09, 'FALSE'),
    (7, 'CT12', '12/04/2000', 'CONTADO', 0.07, 'FALSE'),
    (8, 'CT01', '15/04/2000', 'TARJETA', 0.02, 'TRUE'),
    (9, 'CT21', '21/04/2000', 'CONTADO', 0.04, 'FALSE'),
    (11, 'CT04', '01/05/2001', 'CONTADO', 0.08, 'TRUE'),
    (12, 'CT06', '19/05/2001', 'CONTADO', 0.09, 'TRUE'),
    ( 13,
        'CT13',
        '30/04/2000',
        'APLAZADO',
        0.03,
        'FALSE'
    ),
    (
        16,
        'CT25',
        '11/05/2001',
        'CONTADO',
        0.12,
        'FALSE'
    ),
    (19, 'CT10', '22/05/2002', 'CONTADO', 0.07, 'TRUE'),
    (
        21,
        'CT16',
        '28/05/2001',
        'CONTADO',
        0.03,
        'FALSE'
    ),
    (22, 'CT07', '31/05/2000', 'TARJETA', 0.05, 'TRUE'),
    (
        25,
        'CT18',
        '02/06/2000',
        'CONTADO',
        0.06,
        'FALSE'
    ),
    (
        26,
        'CT09',
        '04/06/2001',
        'APLAZADO',
        0.07,
        'TRUE'
    ),
    (
        27,
        'CT34',
        '06/06/2000',
        'CONTADO',
        0.04,
        'FALSE'
    ),
    (
        28,
        'CT28',
        '08/06/2000',
        'APLAZADO',
        0.08,
        'FALSE'
    ),
    (
        29,
        'CT30',
        '02/04/2001',
        'TARJETA',
        0.06,
        'FALSE'
    ),
    (30, 'CT02', '15/08/2000', 'CONTADO', 0.06, 'TRUE'),
    (31, 'CT30', '08/06/2000', 'TARJETA', 0.05, 'TRUE'),
    (
        32,
        'CT14',
        '20/06/2001',
        'APLAZADO',
        0.06,
        'FALSE'
    ),
    (
        34,
        'CT26',
        '23/06/2002',
        'TARJETA',
        0.05,
        'FALSE'
    ),
    (
        35,
        'CT26',
        '30/06/2001',
        'CONTADO',
        0.06,
        'FALSE'
    ),
    (37, 'CT24', '02/07/2001', 'TARJETA', 0.03, 'TRUE'),
    (39, 'CT20', '08/07/2001', 'TARJETA', 0.06, 'TRUE'),
    (
        40,
        'CT04',
        '12/07/2002',
        'CONTADO',
        0.12,
        'FALSE'
    ),
    (
        42,
        'CT34',
        '15/07/2002',
        'APLAZADO',
        0.07,
        'TRUE'
    ),
    (
        43,
        'CT09',
        '18/07/2001',
        'CONTADO',
        0.07,
        'FALSE'
    ),
    (
        44,
        'CT34',
        '20/07/2002',
        'APLAZADO',
        0.04,
        'FALSE'
    ),
    (
        45,
        'CT30',
        '22/07/2002',
        'TARJETA',
        0.07,
        'FALSE'
    ),
    (
        46,
        'CT31',
        '25/07/2002',
        'CONTADO',
        0.06,
        'FALSE'
    ),
    (
        47,
        'CT34',
        '31/07/2000',
        'APLAZADO',
        0.08,
        'FALSE'
    ),
    (
        48,
        'CT18',
        '30/08/2002',
        'CONTADO',
        0.03,
        'FALSE'
    ),
    (
        49,
        'CT28',
        '02/09/2002',
        'CONTADO',
        0.03,
        'FALSE'
    ),
    (
        50,
        'CT09',
        '05/09/2002',
        'APLAZADO',
        0.08,
        'FALSE'
    ),
    (51, 'CT09', '05/09/2002', 'CONTADO', 0.05, 'TRUE'),
    (
        63,
        'CT28',
        '10/09/2000',
        'CONTADO',
        0.09,
        'FALSE'
    ),
    (72, 'CT01', '18/08/2002', 'CONTADO', 0.05, 'TRUE'),
    (
        73,
        'CT01',
        '02/08/2001',
        'CONTADO',
        0.07,
        'FALSE'
    ),
    (
        74,
        'CT01',
        '17/09/2002',
        'APLAZADO',
        0.08,
        'FALSE'
    ),
    (
        75,
        'CT01',
        '30/09/2002',
        'TARJETA',
        0.12,
        'FALSE'
    ),
    (76, 'CT01', '19/10/2002', 'CONTADO', 0.04, 'TRUE'),
    (
        77,
        'CT01',
        '28/10/2000',
        'CONTADO',
        0.05,
        'FALSE'
    ),
    (
        79,
        'CT34',
        '12/12/2000',
        'CONTADO',
        0.05,
        'FALSE'
    ),
    (
        85,
        'CT04',
        '23/12/2002',
        'TARJETA',
        0.04,
        'FALSE'
    ),
    (
        86,
        'CT09',
        '24/12/2001',
        'APLAZADO',
        0.03,
        'FALSE'
    ),
    (98, 'CT01', '27/12/2001', 'CONTADO', 0.08, 'TRUE'),
    (
        102,
        'CT06',
        '12/01/2001',
        'CONTADO',
        0.07,
        'TRUE'
    ),
    (
        103,
        'CT02',
        '24/01/2001',
        'CONTADO',
        0.04,
        'FALSE'
    ),
    (
        105,
        'CT30',
        '01/01/2001',
        'APLAZADO',
        0.09,
        'FALSE'
    ),
    (5005, 'CT30', '10/08/2002', 'TARJETA', 0, 'TRUE'),
    (5050, 'CT30', '27/03/2002', 'TARJETA', 0, 'TRUE');