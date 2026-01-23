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