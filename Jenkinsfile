def workspace
def owner

node ('master'){

	stage('Get code from github'){
		checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/casalima/CarRatings.git']]])
		workspace = pwd()
	}

//	stage('Static code analysis'){
//		echo "some_static_code_tool_will_analyze"
//		build job: 'NewPipeline-CodeAnalysis', parameters: [string(name: 'workspace', value: workspace)]
//	}

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
	
	
	stage('Build process using Maven'){
		echo "the_build_process"
	}
	
	stage('Unit testing'){
		echo "the_unit_test"
	}
	
	stage('Deploying application'){
		echo "the_deployment"
		
		owner = "Sandro"
		def response = createGreeting(owner)
		echo response
	}
	
}

def String createGreeting(String name)
{
	def greeting = "Hi ${name}. I just finished deploying this app "
	return greeting
}