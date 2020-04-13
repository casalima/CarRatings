def workspace
def owner

node ('master'){

	stage('Get code from github'){
		checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/casalima/CarRatings.git']]])
		workspace = pwd()
	}

	//stage('Static code analysis'){
	//	echo "some_static_code_tool_will_analyze"
	//	build job: 'NewPipeline-CodeAnalysis', parameters: [string(name: 'workspace', value: workspace)]
	//}

/*
	stage('Static code analysis'){
	
	    environment {
			scannerHome = tool 'LocalSonarQubeScanner'
		}
	
		steps {
			
			withSonarQubeEnv('somesonarqube') {
				sh "${scannerHome}/bin/sonar-scanner"
			}
			
			timeout(time: 10, unit: 'MINUTES') {
				waitForQualityGate abortPipeline: true
			}
		}
	
	}
*/
	
    stage('Clean and compile') {
        bat "mvn clean compile"
    }

    stage('Unit testing') {
        bat "mvn test"
    }

    stage('Static code analysis') {
        analyzeWithSonarQubeAndWaitForQualityGoal()
    }
	
	stage('Parallel execution'){
		parallel task1: {
			stage('Task 1'){
				echo "Task 1"
			}
		},
		task2: {
			stage('Task 2'){
				echo "Task 2"
			}
		}
	}
	
	stage('Build process using Maven'){
		echo "the_build_process"
	}
	
	stage('Deploying application'){
		echo "the_deployment"
		
		owner = "Sandro"
		def response = createGreeting(owner)
		echo response
	}
	
}

def String createGreeting(String name){

	def greeting = "Hi ${name}. I just finished deploying this app "
	return greeting
}


def void analyzeWithSonarQubeAndWaitForQualityGoal() {

    withSonarQubeEnv('LocalSonarQubeServer') {
		//echo env.SONAR_MAVEN_GOAL
		//echo bat(returnStdout: true, script: 'set')
        //bat "mvn clean package ${SONAR_MAVEN_GOAL} -Dsonar.host.url=${SONAR_HOST_URL} -Dsonar.login=${SONAR_AUTH_TOKEN} "
        bat "mvn ${SONAR_MAVEN_GOAL} -Dsonar.host.url=${SONAR_HOST_URL} -Dsonar.login=${SONAR_AUTH_TOKEN} "
		//${SONAR_EXTRA_PROPS}
    }
	
    timeout(time: 2, unit: 'MINUTES') {
        def qg = waitForQualityGate()
        if (qg.status != 'OK') {
            currentBuild.result = 'UNSTABLE'
        }
    }
}