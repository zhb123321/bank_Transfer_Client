package com.zl.bts.util;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Page implements Serializable {
    //当前页
    private Integer page=1;
    //页大小
    private Integer rows=5;
    // 总记录 数
    private Integer totalRecord;
    //总页数
    private Integer totalPage;
    //关键字类型
    private String keyType;
    //查询关键字
    private String keyWord;
    //查询关键字的数值起始值
    private Integer startnum;
    //查询关键字的数值结束值
    private Integer endnum;
    //开始记录位置
    private Integer start;
    //结束位置
    private Integer end;
    //用户id
    private String userid;
    //其他用户id
    private String otherid;
    
    //查询关键字
    private String searchCode;
    
 
    public String getSearchCode() {
		return searchCode;
	}

	public void setSearchCode(String searchCode) {
		this.searchCode = searchCode;
	}

	public String getKeyType() {
        return keyType;
    }
 
    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }
 
    public String getOtherid() {
        return otherid;
    }
 
    public void setOtherid(String otherid) {
        this.otherid = otherid;
    }
 
    public String getUserid() {
        return userid;
    }
 
    public void setUserid(String userid) {
        this.userid = userid;
    }
 
    public Integer getPage() {
        return page;
    }
 
    public void setPage(Integer page) {
        this.page = page;
    }
 
    public Integer getRows() {
        return rows;
    }
 
    public void setRows(Integer rows) {
        this.rows = rows;
    }
 
    public Integer getTotalRecord() {
        return totalRecord;
    }
 
    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }
 
    public Integer getTotalPage() {
        totalPage=(totalRecord-1)/rows+1;
        return totalPage;
    }
 
    public void setTotalPage(Integer totalPage) {
 
        this.totalPage = totalPage;
    }
 
    public String getKeyWord() {
        return keyWord;
    }
 
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
 
    public Integer getStart() {
        start=(page-1)*rows;
        return start;
    }
 
    public void setStart(Integer start) {
 
        this.start = start;
    }

    public Integer getEnd() {
    	end=page*rows;
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public Integer getStartnum() {
		return startnum;
	}

	public void setStartnum(Integer startnum) {
		this.startnum = startnum;
	}

	public Integer getEndnum() {
		return endnum;
	}

	public void setEndnum(Integer endnum) {
		this.endnum = endnum;
	}

	public Page() {
    }

	public Page(Integer page, Integer rows, Integer totalRecord, Integer totalPage, String keyType, String keyWord,
			Integer startnum, Integer endnum, Integer start, Integer end, String userid, String otherid,
			String searchCode) {
		super();
		this.page = page;
		this.rows = rows;
		this.totalRecord = totalRecord;
		this.totalPage = totalPage;
		this.keyType = keyType;
		this.keyWord = keyWord;
		this.startnum = startnum;
		this.endnum = endnum;
		this.start = start;
		this.end = end;
		this.userid = userid;
		this.otherid = otherid;
		this.searchCode = searchCode;
	}

	@Override
	public String toString() {
		return "Page [page=" + page + ", rows=" + rows + ", totalRecord=" + totalRecord + ", totalPage=" + totalPage
				+ ", keyType=" + keyType + ", keyWord=" + keyWord + ", startnum=" + startnum + ", endnum=" + endnum
				+ ", start=" + start + ", end=" + end + ", userid=" + userid + ", otherid=" + otherid + ", searchCode="
				+ searchCode + "]";
	}
 
   
}

