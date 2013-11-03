class SmartionaryGrailsPlugin {
    def version = "1.0.0"
    def grailsVersion = "2.0 > *"
    def loadAfter = [ 'hibernate' ]

    def title = "Smartionary Plugin"
    def author = "Aaron Brown"
    def authorEmail = "brown.aaron.lloyd@gmail.com"
    def description = '''\
Facilitates externalizing a Map into a Domain, so that \
and app can support both programmatic and administrative modification \
of variable data.
'''

    def documentation = "http://aaron-brown.github.io/grails-smartionary/docs/manual/index.html"
    def license = "APACHE"
    def issueManagement = [ system: "GITHUB", url: "https://github.com/aaron-brown/grails-smartionary/issues" ]
    def scm = [ url: "https://github.com/aaron-brown/grails-smartionary" ]
}
