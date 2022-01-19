def jobname = "First-Maven-Project-Via-DSL"
def desc = "First Maven job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on github"
def giturl = 'git@github.com:deth2jt/maven_foo.git'
def gitbranch = "master"
//credentials(jm.getCredentialsId(foofoo))

println("spielen ist: " + jobname)

job(jobname) {
    description(desc)
    logRotator(5, 5)
    scm {
	git {
            remote {
                github(giturl, 'ssh')
                credentials('foofoo')
            }
        }
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'maven-samples/single-module/pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.jar'
    }
}
