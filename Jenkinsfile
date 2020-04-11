def workspace
def owner

node ('master'){

	stage('Get code from github'){
		checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/casalima/CarRatings.git']]])
		workspace = pwd()
	}

	stage('Static code analysis'){
		echo "some_static_code_tool_will_analyze"
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
		createGreeting(owner)
	}
	
}

def String createGreeting(String name)
{
	def greeting = "Hi ${name}. I just finished deploying this app "
	return greeting
}