
  layui.use(['element', 'layer', 'jquery'], function () {
           var element = layui.element;
        // var layer = layui.layer;
        var $ = layui.$;
/**
             * 配色方案配置项(默认选中第一个方案)
             * @param bgcolorId
             */
            this.bgColorConfig = function (bgcolorId) {
            	
                var bgColorConfig = [
                    {
                        headerRight: '#1aa094',
                        headerRightThis: '#197971',
                        headerLogo: '#243346',
                        menuLeft: '#2f4056',
                        menuLeftThis: '#1aa094',
                        menuLeftHover: '#3b3f4b',
                    },
                    {
                        headerRight: '#23262e',
                        headerRightThis: '#23262e',
                        headerLogo: '#23262e',
                        menuLeft: '#23262e',
                        menuLeftThis: '#23262e',
                        menuLeftHover: '#23262e',
                    },
                    {
                        headerRight: '#ffa4d1',
                        headerRightThis: '#ffa4d1',
                        headerLogo: '#ffa4d1',
                        menuLeft: '##ffa4d1',
                        menuLeftThis: '#ffa4d1',
                        menuLeftHover: '#ffa4d1',
                    },
                    {
                        headerRight: '#1aa094',
                        headerRightThis: '#197971',
                        headerLogo: '#0c0c0c',
                        menuLeft: '#23262e',
                        menuLeftThis: '#1aa094',
                        menuLeftHover: '#3b3f4b',
                    },
                    {
                        headerRight: '#1e9fff',
                        headerRightThis: '#0069b7',
                        headerLogo: '#0c0c0c',
                        menuLeft: '#1f1f1f',
                        menuLeftThis: '#1aa094',
                        menuLeftHover: '#3b3f4b',
                    },

                    {
                        headerRight: '#ffb800',
                        headerRightThis: '#d09600',
                        headerLogo: '#243346',
                        menuLeft: '#2f4056',
                        menuLeftThis: '#1aa094',
                        menuLeftHover: '#3b3f4b',
                    },
                    {
                        headerRight: '#e82121',
                        headerRightThis: '#ae1919',
                        headerLogo: '#0c0c0c',
                        menuLeft: '#3b3f4b',
                        menuLeftThis: '#1aa094',
                        menuLeftHover: '#3b3f4b',
                    },
                    {
                        headerRight: '#963885',
                        headerRightThis: '#772c6a',
                        headerLogo: '#243346',
                        menuLeft: '#2f4056',
                        menuLeftThis: '#1aa094',
                        menuLeftHover: '#3b3f4b',
                    },
                    {
                        headerRight: '#1e9fff',
                        headerRightThis: '#0069b7',
                        headerLogo: '#0069b7',
                        menuLeft: '#1f1f1f',
                        menuLeftThis: '#1aa094',
                        menuLeftHover: '#3b3f4b',
                    },
                    {
                        headerRight: '#ffb800',
                        headerRightThis: '#d09600',
                        headerLogo: '#d09600',
                        menuLeft: '#2f4056',
                        menuLeftThis: '#1aa094',
                        menuLeftHover: '#3b3f4b',
                    },
                    {
                        headerRight: '#e82121',
                        headerRightThis: '#ae1919',
                        headerLogo: '#d91f1f',
                        menuLeft: '#1f1f1f',
                        menuLeftThis: '#1aa094',
                        menuLeftHover: '#3b3f4b',
                    },
                    {
                        headerRight: '#963885',
                        headerRightThis: '#772c6a',
                        headerLogo: '#772c6a',
                        menuLeft: '#2f4056',
                        menuLeftThis: '#1aa094',
                        menuLeftHover: '#3b3f4b',
                    }
                ];

                if (bgcolorId == undefined) {
                    return bgColorConfig;
                } else {
                    return bgColorConfig[bgcolorId];
                }
            };

   		   $('body').on('click', '[data-bgcolor]', function () {
            var loading = layer.load(0, {shade: false, time: 2 * 1000});
            var clientHeight = (document.documentElement.clientHeight) - 400;
            var bgColorHtml = layui.buildBgColorHtml();
            var html = '<div class="layui-color">\n' +
                '<div class="color-title">\n' +
                '<span>配色方案</span>\n' +
                '</div>\n' +
                '<div class="color-content" >\n' +
                '<ul >\n' + bgColorHtml + '</ul>\n' +
                '</div>\n' +
                '</div>';
            layer.open({
                type: 1,
                title: false,
                closeBtn: 0,
                shade: 0.2,
                anim: 1,
                shadeClose: true,
                id: 'layuiBgColor',
                area: ['320px', clientHeight + 'px'],
                offset: 'rt',
                content: html,
            });
            layer.close(loading);
        });
        
        
   					 /**
             * 构建背景颜色选择
             * @returns {string}
             */
            this.buildBgColorHtml = function () {
                var html = '';
                var bgcolorId = sessionStorage.getItem('layuiBgcolorId');
                if (bgcolorId == null || bgcolorId == undefined || bgcolorId == '') {
                    bgcolorId = 0;
                }
                var bgColorConfig = layui.bgColorConfig();
                $.each(bgColorConfig, function (key, val) {
                    if (key == bgcolorId) {
                        html += '<li class="layui-this" data-select-bgcolor="' + key + '"  >\n';
                    } else {
                        html += '<li  data-select-bgcolor="' + key + '">\n';
                    }
                    html += '<a href="javascript:;" data-skin="skin-blue" style="" class="clearfix full-opacity-hover">\n' +
                        '<div><span style="display:block; width: 20%; float: left; height: 12px; background: ' + val.headerLogo 
                        + ';"></span><span style="display:block; width: 80%; float: left; height: 12px; background: ' + val.headerRight 
                        + ';"></span></div>\n' 
                        +'<div><span style="display:block; width: 20%; float: left; height: 40px; background: ' + val.menuLeft 
                        +';"></span><span style="display:block; width: 80%; float: left; height: 40px; background: #f4f5f7;"></span></div>\n' 
                        +'</a>\n' +
                        '</li>';
                });
                return html;
            };
            
            
        /**
         * 选择配色方案
         */
        $('body').on('click', '[data-select-bgcolor]', function () {
            var bgcolorId = $(this).attr('data-select-bgcolor');
            $('.layui-color .color-content ul .layui-this').attr('class', '');
            $(this).attr('class', 'layui-this');
            sessionStorage.setItem('layuiBgcolorId', bgcolorId);
            layui.initBgColor();
        });

 		 this.initBgColor = function () {
                var bgcolorId = sessionStorage.getItem('layuiBgcolorId');
                if (bgcolorId == null || bgcolorId == undefined || bgcolorId == '') {
                    bgcolorId = layui.config('BgColorDefault');
                }
                var bgcolorData = layui.bgColorConfig(bgcolorId);
                var styleHtml = '.layui-layout-admin .layui-header{background-color:' + bgcolorData.headerRight + '!important;}\n' +
                    '.layui-header>ul>.layui-nav-item.layui-this,.layui-tool i:hover{background-color:' + bgcolorData.headerRightThis + '!important;}\n' +
                    '.layui-layout-admin .layui-logo {background-color:' + bgcolorData.headerLogo + '!important;}\n' +
                    '.layui-side.layui-bg-black,.layui-side .layui-bg-black>ul>.layui-nav .layui-nav-tree .layui-nav-item {background-color:' + bgcolorData.menuLeft + '!important;}\n' +
                    '.layui-nav .layui-nav-child a:hover:not(.layui-this) {background-color:' + bgcolorData.menuLeftHover + '!important;}\n' +
                    '.layui-layout-admin .layui-nav-tree .layui-this, .layui-layout-admin .layui-nav-tree .layui-this>a, .layui-layout-admin .layui-nav-tree .layui-nav-child dd.layui-this, .layui-layout-admin .layui-nav-tree .layui-nav-child dd.layui-this a {\n' +
                    'background-color: ' + bgcolorData.menuLeftThis + ' !important;\n' +
                    '}';
                $('#layui-bg-color').html(styleHtml);
            };
            exports("layui", layui);
    }
);
