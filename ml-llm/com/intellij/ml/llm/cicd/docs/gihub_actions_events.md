# GitHub Actions CI/CD configs generation

## Common prompt prefix:

```
Create build.yml YAML file for GitHub Action with workflow:
...
```

## Events. Workflow triggering

Part of prompt with triggers description:

```
...
- triggers on push to branches 'main', all 'releases' only on any javascript file change
- triggers on pull request 'opened', 'closed' to branch 'main' 
- schedule on Monday and Friday at 10 am 
...
```

AI assistant output:

```yaml
on:
  push:
    branches:
      - main
      - releases/*
    paths:
      - '*.js'
  pull_request:
    branches:
      - main
    types: [opened, closed]
  schedule:
    - cron: '0 10 * * 1,5'
```