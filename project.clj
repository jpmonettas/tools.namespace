(defproject jpmonettas/tools.namespace "0.3.2"
  :description "jpmonettas tools.namespace fork"
  :parent [org.clojure/pom.contrib "0.2.2"]
  :url "https://github.com/jpmonettas/tools.namespace"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.7.0" :scope "provided"]
                 [org.clojure/java.classpath "0.3.0"]
                 [org.clojure/tools.reader "1.3.2"]]
  :min-lein-version "2.0.0")
