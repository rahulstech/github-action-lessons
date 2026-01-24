# Github Actions

## Terminology

* **Trigger**: an event that stats the action. for example: `push`, `pull_request` etc.
* **Jobs**: set of tasks (`steps`) to run.
* **Runner**: the os to execute the steps. for example: `ubuntu-latest`.
* **Step**: a single piece of task.
  - `uses` used when using predefined set of steps from Github Actions marketplace. for example `actions/checkout@v4`
  - `run` used when executing a shell command

**IMPORTANT** github workflows are saved under `$projectRoot/.github/workflows/name-of-workflow.yml`


## Learning Outcome

- Copy current branch content to the runner using **actions/checkout@v4**
- Setup java open-jdk 21 (temurin-21) using **actions/setup-java@v4**
- Run `gradle` test
- Cache gradle dependencies for future use
- Upload artifact using **actions/upload-artifact@v4**
- Parsing test report using **mikepenz/action-junit-report@v4**
- Add permission (read/write) to workflow
- Add branch protection. allow merge to master via only pull_request only when specified check pases. to turn on the branch protection:
    - goto GitHub Repo Settings tab > Branches
    - click **Add branch protection rule** or **Add rule** (if already added any rule)
    - add **Branch name pattern**. this is the name of the branch of name pattern of 
      branch name to protect from unchecked pull_request. for example: master
    - enable the followings
        [x] Require a pull request before merging
        [x] Require status checks to pass before merging
    - add the name of the workflow to pass check. for example: in this case **Simple Java Gradle app workflow**
    - save
  now any `merge` request on specified branch(es) is rejected other than a `pull_request`
  