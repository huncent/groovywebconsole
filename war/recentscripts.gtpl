<html>
    <head>
        <title>Groovy web console - Recent scripts ${params.author ? "by " + params.author : ""}</title>

        <link rel="alternate"
                type="application/atom+xml"
                href="/atom.groovy"
                title="Groovy Web Console snippets atom feed"
        />

        <link rel="stylesheet" type="text/css" href="/css/redmond/jquery-ui-1.7.1.custom.css"/>
        <link rel="stylesheet" type="text/css" href="/css/main.css"/>
    </head>

    <body>
        <h1><a href="/">Groovy web console</a></h1>

        <table cellspacing="20" style="float:right">
            <tr>
                <td>
                    <a id="atomLink" href="/atom.groovy">
                        <table>
                            <tr>
                                <td><img src="/images/atom-feed.png" alt="subscribe to the feed" align="left" border="0"></td>
                                <td><i>Subscribe<br/>to this<br/>site</i></td>
                            </tr>
                        </table>
                    </a>
                </td>
            </tr>
        </table>

        <h2>Recent scripts ${params.author ? "by " + params.author : ""} ${params.tag ? " with tag '" + params.tag + "'" : ""}</h2>

        <div id="actionsBreadcrumb">
            <span class="actionsBreadcrumbHead">Actions &nbsp;&#x27A4;</span>
            <span class="actionsBreadcrumb${params.author || params.tag ? "" : "Last"}Child"><a href="/">Back to console</a></span>
            <% if (params.author || params.tag) { %>
            <span class="actionsBreadcrumbLastChild"><a href="/recentscripts.gtpl?limit=40">View all recent scripts</a></span>
            <% } %>
        </div>

        <% include "/recenttagsandauthors.groovy" %>
        <div class="indent">
            <% include "/recentscripts.groovy" %>
        </div>

        <% include "/WEB-INF/includes/footer.gtpl" %>

    </body>
</html>