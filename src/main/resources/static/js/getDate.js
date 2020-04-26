$(function () {

    $.post({
        url: 'user/getAll',
        success: function (data) {


            for (var i = 0; i < data.length; i++) {

                var item = data[i];
                if (item.status == '0') {
                    item.status = '正常';
                } else {
                    item.status = '删除';
                }

                var text = "<tr>\n" +
                    "                    <td>" + item.id + "</td>\n" +
                    "                    <td>" + item.username + "</td>\n" +
                    "                    <td>" + item.password + "</td>\n" +
                    "                    <td>" + item.createtime + "</td>\n" +
                    "                    <td>" + item.status + "</td>\n" +
                    "                    <td>\n" +
                    "                        <a href=\"user/delById?id=" + data[i].id + "\"  class=\"btn btn-danger\">删除</a>\n" +
                    "                        <a href=\"#\" class=\"btn btn-success\">修改</a>\n" +
                    "                    </td>\n" +
                    "                </tr>"

                $('.pool').append(text);
            }

        }
    });

});

