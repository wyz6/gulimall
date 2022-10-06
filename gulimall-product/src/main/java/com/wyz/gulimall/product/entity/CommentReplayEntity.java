package com.wyz.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ??Ʒ???ۻظ???ϵ
 * 
 * @author wu-yuezhou
 * @email wyz18405583620@gmail.com
 * @date 2022-09-23 20:46:07
 */
@Data
@TableName("pms_comment_replay")
public class CommentReplayEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ????id
	 */
	private Long commentId;
	/**
	 * ?ظ?id
	 */
	private Long replyId;

}
