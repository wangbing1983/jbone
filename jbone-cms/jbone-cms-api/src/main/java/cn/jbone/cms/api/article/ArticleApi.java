package cn.jbone.cms.api.article;

import cn.jbone.cms.common.module.article.ArticleRequest;
import cn.jbone.cms.common.module.article.ArticleResponse;
import cn.jbone.common.rpc.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/article")
public interface ArticleApi {

    @RequestMapping(value = "/add",method = {RequestMethod.POST})
    Result<ArticleResponse> addArticle(@RequestBody ArticleRequest articleRequest);

    @RequestMapping(value = "/update",method = {RequestMethod.POST})
    Result<ArticleResponse> updateArticle(@RequestBody ArticleRequest articleRequest);

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE})
    Result<Void> deleteArticle(@RequestParam("id") Long id);

    @RequestMapping(value = "/get",method = {RequestMethod.GET})
    Result<ArticleResponse> getArticle(@RequestParam("id") Long id);

}
