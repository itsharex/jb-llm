# GitHub Actions CI/CD configs generation

## Common prompt prefix:

```
Create build.yml YAML file for GitHub Action with workflow:
...
```

## Build project

<details>
  <summary>Gradle</summary>

Example from doc:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v3
      - name: Set up JDK 17
        uses: actions/setup-java@v3
        with:
          java-version: '17'
          distribution: 'temurin'
      - name: Validate Gradle wrapper
        uses: gradle/wrapper-validation-action@v2
      - name: Build with Gradle
        uses: gradle/gradle-build-action@v2
        with:
          arguments: build
```

Prompt:

```
...
Add job 'build':
- use latest ubuntu version  
- build java gradle project using gradlew
- run tests
...
```

AI assistant output:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - run: ./gradlew build
      - run: ./gradlew test
```

</details>

<details>
  <summary>Maven</summary>

Example from doc:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v3
      - name: Set up JDK 17
        uses: actions/setup-java@v3
        with:
          java-version: '17'
          distribution: 'temurin'
      - name: Build with Maven
        run: mvn --batch-mode --update-snapshots package
```

Prompt:

```
...
Add job 'build':
- use latest ubuntu version  
- build java maven project
- run tests
...
```

AI assistant output:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - name: Build Java Maven Project
        run: mvn package
      - name: Run tests
        run: mvn test
```

</details>
<details>
  <summary>Node nmp</summary>

Example from doc:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest
    strategy:
      matrix:
        node-version: [10.x, 12.x, 14.x, 15.x]
    steps:
      - uses: actions/checkout@v3
      - name: Use Node.js ${{ matrix.node-version }}
        uses: actions/setup-node@v3
        with:
          node-version: ${{ matrix.node-version }}
      - run: npm ci
      - run: npm run build --if-present
      - run: npm test
```

Prompt:

```
...
Add job 'build':
- use latest ubuntu version  
- Set up Node.js
- build project using npm
- run tests
...
```

AI assistant output:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - name: Set up Node.js
        uses: actions/setup-node@v1
        with:
          node-version: '12.x'
      - name: Build project
        run: npm run build
      - name: Run tests
        run: npm test
```

</details>
<details>
  <summary>Node yarn</summary>

Example from doc:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest
    strategy:
      matrix:
        node-version: [10.x, 12.x, 14.x, 15.x]
    steps:
      - uses: actions/checkout@v3
      - name: Use Node.js ${{ matrix.node-version }}
        uses: actions/setup-node@v3
        with:
          node-version: ${{ matrix.node-version }}
          cache: 'yarn'
      - run: yarn
      - run: yarn test
```

Prompt:

```
...
Add job 'build':
- use latest ubuntu version  
- Set up Node.js
- build project using npm
- run tests
...
```

AI assistant output:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - name: Set up Node.js
        uses: actions/setup-node@v1
        with:
          node-version: '12.x'
      - name: Build project
        run: yarn
      - name: Run tests
        run: yarn test
```

</details>
<details>
  <summary>Python</summary>

Example from doc:

```yaml
jobs:
  build:

    runs-on: ubuntu-latest
    strategy:
      matrix:
        python-version: ["3.7", "3.8", "3.9", "3.10"]

    steps:
      - uses: actions/checkout@v3
      - name: Set up Python ${{ matrix.python-version }}
        uses: actions/setup-python@v4
        with:
          python-version: ${{ matrix.python-version }}
      - name: Install dependencies
        run: |
          python -m pip install --upgrade pip
          pip install flake8 pytest
          if [ -f requirements.txt ]; then pip install -r requirements.txt; fi
      - name: Lint with flake8
        run: |
          # stop the build if there are Python syntax errors or undefined names
          flake8 . --count --select=E9,F63,F7,F82 --show-source --statistics
          # exit-zero treats all errors as warnings. The GitHub editor is 127 chars wide
          flake8 . --count --exit-zero --max-complexity=10 --max-line-length=127 --statistics
      - name: Test with pytest
        run: |
          pytest
```

Prompt:

```
...
Add job 'build':
- use latest ubuntu version  
- setup python
- install dependencies
- run tests
...
```

AI assistant output:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - name: Set up Python
        uses: actions/setup-python@v2
        with:
          python-version: 3.8
      - name: Install Dependencies
        run: pip install -r requirements.txt
      - name: Run Tests
        run: pytest
```

</details>
<details>
  <summary>Cmake</summary>

Example from doc:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - name: Setup cmake
        uses: jwlawson/actions-setup-cmake@v1.13
        with:
          cmake-version: '3.16.x'
      - name: Build
        run: cmake --build build

      - name: Test
        run: |
          cd build
          ctest --output-on-failure
```

Prompt:

```
...
Add job 'build':
- use latest ubuntu version  
- setup cmake using jwlawson/actions-setup-cmake@v1.13
- build cmake project
- run tests using ctest
...
```

AI assistant output:

```yaml
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - name: Setup cmake
        uses: jwlawson/actions-setup-cmake@v1.13
      - name: Build with cmake
        run: cmake --build .
      - name: Run tests
        run: ctest
```

</details>
