package th.co.pchome.noti_j.vo;

import lombok.Data;

import java.util.List;

/**
 * View object- Paging
 */
@Data
public class PagingVo<T> {

	/**
	 * 總筆數
	 */
	private long total;

	/**
	 * 列表資料
	 */
	private List<T> rows;
}
