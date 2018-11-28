package com.mpq.demo.entity;

import lombok.Data;

import java.util.List;
@Data
public class Test {

    /**
     * id : 0
     * title_hello : aaa
     * children : [{"id":9,"title_hello":"QA测试12","children":null},{"id":21,"title_hello":"鱿鱼","children":null}]
     */

    private int id;
    private String title_hello;
    private List<ChildrenBean> children;

    public static class ChildrenBean {
        /**
         * id : 9
         * title_hello : QA测试12
         * children : null
         */

        private int id;
        private String title_hello;
        private Object children;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle_hello() {
            return title_hello;
        }

        public void setTitle_hello(String title_hello) {
            this.title_hello = title_hello;
        }

        public Object getChildren() {
            return children;
        }

        public void setChildren(Object children) {
            this.children = children;
        }
    }
}
