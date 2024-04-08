package com.fit2cloud.oss.dto;

/**
 * @author upeoe
 * @create 2018/12/6 15:29
 */
public class OsPage {

    public static final long NO_LIMIT = -1L;
    public static final long NO_OFFSET = 0L;

    public static final long IS_SYNC = 1L;
    public static final long NO_SYNC = 0L;

    protected Long limit;
    protected Long offset;
    protected String q;
    protected String sort;

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public static class Builder {
        private OsPage page = new OsPage();

        public Builder limit(Long limit) {
            page.setLimit(limit);
            return this;
        }

        public Builder offset(Long offset) {
            page.setOffset(offset);
            return this;
        }

        public Builder q(String query) {
            page.setQ(query);
            return this;
        }

        public Builder sort(String sort) {
            page.setSort(sort);
            return this;
        }

        public OsPage build() {
            return this.page;
        }
    }

    @Override
    public String toString() {
        return "OSPage{" +
                "limit=" + limit +
                ", offset=" + offset +
                ", q='" + q + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }
}
