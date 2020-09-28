--外键约束检查SET FOREIGN_KEY_CHECKS = 0;
-- auto-generated definition
create table daas_base_province
(
    id              int auto_increment
        primary key,
    province_code   char(10)                              not null,
    province_name   varchar(100)                          not null,
    created_by      int         default 1                 not null,
    created_by_name varchar(50) default 'root'            not null,
    created_date    timestamp   default CURRENT_TIMESTAMP not null,
    updated_by      int         default 1                 not null,
    updated_by_name varchar(50) default 'root'            not null,
    updated_date    timestamp   default CURRENT_TIMESTAMP not null,
    version         int         default 1                 not null,
    constraint province_code_pk
        unique (province_code)
)
    charset = utf8;
-- auto-generated definition
create table daas_base_city
(
    id              int auto_increment
        primary key,
    city_code       char(10)                              not null,
    city_name       varchar(100)                          not null,
    province_code   char(10)                              not null,
    created_by      int         default 1                 not null,
    created_by_name varchar(50) default 'root'            not null,
    created_date    timestamp   default CURRENT_TIMESTAMP not null,
    updated_by      int         default 1                 not null,
    updated_by_name varchar(50) default 'root'            not null,
    updated_date    timestamp   default CURRENT_TIMESTAMP not null,
    version         int         default 1                 not null,
    constraint daas_base_city_city_code_uindex
        unique (city_code),
    constraint daas_base_city_province_fk
        foreign key (province_code) references daas_base_province (province_code)
)
    charset = utf8;
-- auto-generated definition
create table daas_base_business_district
(
    id                     int auto_increment
        primary key,
    business_district_code char(10)                              not null,
    business_district_name varchar(100)                          not null,
    area_code              char(10)                              not null,
    created_by             int         default 1                 not null,
    created_by_name        varchar(50) default 'root'            not null,
    created_date           timestamp   default CURRENT_TIMESTAMP not null,
    updated_by             int         default 1                 not null,
    updated_by_name        varchar(50) default 'root'            not null,
    updated_date           timestamp   default CURRENT_TIMESTAMP not null,
    version                int         default 1                 not null,
    constraint daas_base_business_district_business_district_code_uindex
        unique (business_district_code),
    constraint daas_base_business_district_area_fk
        foreign key (area_code) references daas_base_area (area_code)
)
    charset = utf8;
-- auto-generated definition
create table daas_base_area
(
    id              int auto_increment
        primary key,
    area_code       char(10)                              not null,
    area_name       varchar(100)                          not null,
    city_code       char(10)                              not null,
    created_by      int         default 1                 not null,
    created_by_name varchar(50) default 'root'            not null,
    created_date    timestamp   default CURRENT_TIMESTAMP not null,
    updated_by      int         default 1                 null,
    updated_by_name varchar(50) default 'root'            not null,
    updated_date    timestamp   default CURRENT_TIMESTAMP not null,
    version         int         default 1                 not null,
    constraint daas_base_area_area_code_uindex
        unique (area_code),
    constraint daas_base_area_city_fk
        foreign key (city_code) references daas_base_city (city_code)
)
    charset = utf8;