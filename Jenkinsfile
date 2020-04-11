def globalworkspace

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
	
}