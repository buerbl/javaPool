-- -- UNIQUE KEY `IDX_UGCV_USER` (`user_id`,`qu_lottery_goods_id`,`chip_id`,`version`)
-- -- 第一位置 user_id
-- -- 第二位置 qu_lottery_goods_id
-- -- 第三位置 chip_id
-- -- 第四位置 version


-- 使用第一位置的索引字段 索引起作用
EXPLAIN SELECT * from qu_lottery_user WHERE user_id = 797619 ;

-- 使用第二位置的索引字段 索引不起作用
EXPLAIN SELECT * from qu_lottery_user WHERE  chip_id = 16 ;

-- 使用第一位置的索引字段和第二位置的索引字段 索引起作用
EXPLAIN SELECT * from qu_lottery_user WHERE user_id = 797619 and chip_id = 16 ;

-- 使用第二位置的索引字段和第一位置的索引字段 索引起作用
EXPLAIN SELECT * from qu_lottery_user WHERE chip_id = 16 and user_id = 797619  ;

-- 打算使用第二第三个位置的索引 不起作用
EXPLAIN SELECT * from qu_lottery_user WHERE qu_lottery_goods_id = 797619 and chip_id = 16 ;


-- 使用or连接有索引的字段 不起作用
EXPLAIN SELECT * from qu_lottery_user WHERE user_id = 797619 or chip_id = 16 ;
