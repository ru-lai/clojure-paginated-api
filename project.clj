(defproject paginated-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/java.jdbc "0.7.9"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [mysql/mysql-connector-java "8.0.16"]]
  :main ^:skip-aot paginated-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
