CREATE TABLE `dsp_property_progress` (
                                   `progress_code` varchar(32) NOT NULL COMMENT '楼盘进度code',
                                   `property_code` varchar(32) NOT NULL COMMENT '楼盘code',
                                   `property_name` varchar(100) DEFAULT NULL COMMENT '楼盘名称推广名',
                                   `land_code` varchar(32) NOT NULL COMMENT '地块code',
                                   `land_name` varchar(100) DEFAULT NULL COMMENT '地块名称',
                                   `city_id` varchar(50) DEFAULT NULL COMMENT '城市id',
                                   `city_name` varchar(100) DEFAULT NULL COMMENT '城市名称',
                                   `district_id` varchar(50) DEFAULT NULL COMMENT '城区id',
                                   `district_id_name` varchar(100) DEFAULT NULL COMMENT '城区名称',
                                   `block_id` varchar(50) DEFAULT NULL COMMENT '板块id',
                                   `block_name` varchar(100) DEFAULT NULL COMMENT '板块名称',
                                   `land_get_date` date DEFAULT NULL COMMENT '拿地日期',
                                   `contract_start_date` date DEFAULT NULL COMMENT '合同开工日期',
                                   `contract_issue_date` date DEFAULT NULL COMMENT '合同交付日期',
                                   `aerial_photo_date` date DEFAULT NULL COMMENT '创建航拍日期',
                                   `build_count` int(4) DEFAULT NULL COMMENT '楼幢数',
                                   `sf_aerial_photo` int(2) DEFAULT NULL COMMENT '是否关联航拍图0:是，1:否，默认为：1',
                                   `sf_build` int(2) DEFAULT NULL COMMENT '是否关联幢 0:是，1:否，默认为：1',
                                   `native_code` int(2) DEFAULT NULL COMMENT '原生code',
                                   `check_code` int(2) DEFAULT NULL COMMENT '审核code',
                                   `history` int(2) DEFAULT NULL COMMENT '历史标识0：有效,1:历史',
                                   `creator_id` varchar(32) DEFAULT NULL COMMENT '创建人ID',
                                   `creator` varchar(50) DEFAULT NULL COMMENT '创建人',
                                   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                   `updator_id` varchar(50) DEFAULT NULL COMMENT '最后修改人ID',
                                   `updator` varchar(50) DEFAULT NULL COMMENT '最后修改人',
                                   `update_time` datetime DEFAULT NULL COMMENT '最后修改时间',
                                   PRIMARY KEY (`progress_code`),
                                   KEY `pk_index_01` (`property_code`,`progress_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目建设进度表';


CREATE TABLE `dsp_property_progress_file_rel` (
                                        `id` varchar(32) NOT NULL COMMENT 'id',
                                        `progress_code` varchar(32) DEFAULT NULL COMMENT '土地code',
                                        `file_code` varchar(200) DEFAULT NULL COMMENT '文件code',
                                        `file_type` int(2) DEFAULT NULL COMMENT '文件类型：1：鸟瞰图，2：航拍文件',
                                        `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                        `remark` varchar(200) DEFAULT NULL COMMENT '备注',
                                        PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='项目建设进度文件(图片)关系表';

CREATE TABLE `dsp_property_progress_file` (
                                      `id` varchar(32) NOT NULL COMMENT 'id',
                                      `file_code` varchar(200) NOT NULL COMMENT '文件code',
                                      `file_name` varchar(100) NOT NULL COMMENT '文件名称',
                                      `file_address` varchar(200) DEFAULT NULL COMMENT '文件地址',
                                      `file_format` int(2) DEFAULT NULL COMMENT '文件格式：1：图片，2：视频，3：文件',
                                      `remark` varchar(200) DEFAULT NULL COMMENT '备注',
                                      `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                      `history` int(2) DEFAULT NULL COMMENT '历史标识1无效0有效',
                                      PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='项目建设进度文件(图片)表';

CREATE TABLE `dsp_property_progress_build` (
                                         `build_code` varchar(32) NOT NULL COMMENT '幢code',
                                         `progress_code` varchar(32) NOT NULL COMMENT '楼盘进度code',
                                         `current_build` int(4) DEFAULT NULL COMMENT '当前幢号',
                                         `current_build_status` int(4) DEFAULT NULL COMMENT '当前幢节点：1拿地、2 开工、3 正负零、4 首次领证、5 结顶、6 外立面、7 竣备、8 交付',
                                         `associate_build` int(4) DEFAULT NULL COMMENT '关联幢号',
                                         `file_name` varchar(100) NOT NULL COMMENT '文件名称',
                                         `file_address` varchar(200) DEFAULT NULL COMMENT '文件地址',
                                         `history` int(2) DEFAULT NULL COMMENT '历史标识0：有效,1:历史',
                                         `creator_id` varchar(32) DEFAULT NULL COMMENT '创建人ID',
                                         `creator` varchar(50) DEFAULT NULL COMMENT '创建人',
                                         `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                         `updator_id` varchar(50) DEFAULT NULL COMMENT '最后修改人ID',
                                         `updator` varchar(50) DEFAULT NULL COMMENT '最后修改人',
                                         `update_time` datetime DEFAULT NULL COMMENT '最后修改时间',
                                         PRIMARY KEY (`build_code`),
                                         KEY `pk_index_01` (`property_code`,`progress_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目幢建设进度表';

INSERT INTO `sjwh_jsmart`.`pub_dictionary`(`id`, `dic_code`, `dic_name`, `dic_key`, `dic_value`, `dic_sort`, `is_eff`, `create_people`, `create_people_id`, `create_time`, `modify_people`, `modify_people_id`, `modify_time`)
VALUES ('732', '6015', '建设节点', 1, '拿地', 1, 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sjwh_jsmart`.`pub_dictionary`(`id`, `dic_code`, `dic_name`, `dic_key`, `dic_value`, `dic_sort`, `is_eff`, `create_people`, `create_people_id`, `create_time`, `modify_people`, `modify_people_id`, `modify_time`)
VALUES ('733', '6015', '建设节点', 2, '开工', 2, 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sjwh_jsmart`.`pub_dictionary`(`id`, `dic_code`, `dic_name`, `dic_key`, `dic_value`, `dic_sort`, `is_eff`, `create_people`, `create_people_id`, `create_time`, `modify_people`, `modify_people_id`, `modify_time`)
VALUES ('734', '6015', '建设节点', 3, '正负零', 3, 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sjwh_jsmart`.`pub_dictionary`(`id`, `dic_code`, `dic_name`, `dic_key`, `dic_value`, `dic_sort`, `is_eff`, `create_people`, `create_people_id`, `create_time`, `modify_people`, `modify_people_id`, `modify_time`)
 VALUES ('735', '6015', '建设节点', 4, '首次领证', 4, 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sjwh_jsmart`.`pub_dictionary`(`id`, `dic_code`, `dic_name`, `dic_key`, `dic_value`, `dic_sort`, `is_eff`, `create_people`, `create_people_id`, `create_time`, `modify_people`, `modify_people_id`, `modify_time`)
 VALUES ('736', '6015', '建设节点', 5, '结顶', 5, 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sjwh_jsmart`.`pub_dictionary`(`id`, `dic_code`, `dic_name`, `dic_key`, `dic_value`, `dic_sort`, `is_eff`, `create_people`, `create_people_id`, `create_time`, `modify_people`, `modify_people_id`, `modify_time`)
VALUES ('737', '6015', '建设节点', 6, ' 外立面', 6, 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sjwh_jsmart`.`pub_dictionary`(`id`, `dic_code`, `dic_name`, `dic_key`, `dic_value`, `dic_sort`, `is_eff`, `create_people`, `create_people_id`, `create_time`, `modify_people`, `modify_people_id`, `modify_time`)
VALUES ('738', '6015', '建设节点', 7, '竣备', 7, 0, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sjwh_jsmart`.`pub_dictionary`(`id`, `dic_code`, `dic_name`, `dic_key`, `dic_value`, `dic_sort`, `is_eff`, `create_people`, `create_people_id`, `create_time`, `modify_people`, `modify_people_id`, `modify_time`)
VALUES ('739', '6015', '建设节点', 8, '交付', 8, 0, NULL, NULL, NULL, NULL, NULL, NULL);
