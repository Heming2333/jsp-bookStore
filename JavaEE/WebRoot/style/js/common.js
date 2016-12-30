/**
 * Created by 91606 on 2016/12/10.
 */
var item = {
    datas: null,
    father:null,
    childrens:null,
    itemLen:undefined,
    Originitem:null,
    editItem:function(e){
        datas = new Array();
        father = $(e).parents("tr");
        OriginItem = father.html();
        childrens = father.children();
        itemLen = childrens.length;
        var i;
        for(i = 1; i < itemLen - 1; i++){
            datas.push(childrens.eq(i).text());
            childrens.eq(i).html('<input type="text" class="am-form-field am-radius am-input-sm" value="'+datas[i-1]+'">');
        }
        childrens.eq(itemLen-1).html('<div class="am-btn-toolbar">'+
            '<div class="am-btn-group am-btn-group-xs">'+
            '<button type="button" class="am-btn am-btn-default am-btn-xs am-text-secondary saveEdit" onclick="item.saveEditItem(this)"><span class="am-icon-pencil-square-o"></span> 保存</button>'+
            '<button type="button" class="am-btn am-btn-default am-btn-xs am-hide-sm-only cancelEdit" onclick="item.cancelEditItem()"><span class="am-icon-save"></span> 取消</button>'+
            '</div> </div>');
    },
    cancelEditItem:function(){
        father.html(OriginItem);
    },
    saveEditItem:function(e){
        father = $(e).parents("tr");
        childrens = father.children();
        var i;
        for(i = 1; i < itemLen - 1; i++){
            datas[i-1] = childrens.eq(i).children().val();
            alert(datas[i-1]);
        }
        for(i = 1; i < itemLen - 1; i++){
            childrens.eq(i).html('<td>'+datas[i-1]+'</td>');
        }
        childrens.eq(itemLen-1).html('<div class="am-btn-toolbar">'+
            '<div class="am-btn-group am-btn-group-xs">'+
            '<button type="button" class="am-btn am-btn-default am-btn-xs am-text-secondary saveEdit" onclick="item.editItem(this)"><span class="am-icon-pencil-square-o"></span> 编辑</button>'+
            '<button type="button" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span> 删除</button>'+
            '</div> </div>');
    }
};
