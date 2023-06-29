# GitHub Actions CI/CD configs generation

## Main components

* [Workflow](https://docs.github.com/en/actions/learn-github-actions/understanding-github-actions#workflows)
  -- process which runs `jobs` when it is triggered by `event`.
  All workflows defined in `.github/workflows` directory.
* [Event](https://docs.github.com/en/actions/learn-github-actions/understanding-github-actions#events)
  -- specific activity in a repository that triggers a workflow run. Defines in yaml file in `on` section like:
  * `push`
    ```yaml 
    on: 
      push:
        branches:
          - 'main'
          - 'releases/**'
        paths:
          - '**.js'
        tags:
          - v1.**
    ``` 
  * `pull_request`
    ```yaml     
    on: 
      pull_request:
        types: [opened, reopened]
    ``` 
  * `schedule`
    ```yaml 
    on: 
      schedule:
        - cron: '30 5 * * 1,3'
    ```
  * `workflow_run`
    ```yaml     
    on:
      workflow_run:
        workflows: [Build]
        types: [completed]
    jobs:
      on-success:
        ...
      on-failure:
        ...
    ``` 
* [Job](https://docs.github.com/en/actions/learn-github-actions/understanding-github-actions#jobs)
  -- group of steps in a workflow that execute on the same runner
  Defines in yaml file in `jobs` section by unique id like:
  ```yaml
  on:
    ...
  jobs:
    build:
      name: Build project
      runs-on: ubuntu-latest
      strategy:
        matrix: # build for all (os, version) combinations
          os: [ubuntu-22.04, ubuntu-20.04]
          version: [10, 12, 14]
          configuration:
          - Debug
          - Release
      steps:
      - uses: actions/checkout@v2

      - name: Set up Node.js # Name can be omitted
        uses: actions/setup-node@master
        with:
          node-version: ${{ matrix.version }}
        
      - name: Npm Install
        run: npm install
        ...

    deploy: 
      name: Deploy project
      needs: build
      ...
  ```

* [Action](https://docs.github.com/en/actions/learn-github-actions/understanding-github-actions#actions)
  -- prewritten steps to run in job. Full list you can find in [marketplace](https://github.com/marketplace?type=actions)
  * actions/checkout@v2
  * actions/setup-node@v1\
    actions/setup-java@v3\
    actions/setup-dotnet@v1\
    actions/cache@v1\
    ...
  * actions/create-release@v1
  * actions/upload-artifact@v2
  * actions/download-artifact@v2
  * actions/upload-release-asset@v1

* [Secrets](https://docs.github.com/en/actions/security-guides/encrypted-secrets)
  -- credentials which must me kept in secret. 
