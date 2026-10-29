# APK signing in GitHub Actions

The release workflow runs on pushes to `main` and manual dispatches. Configure
these repository secrets in **Settings → Secrets and variables → Actions** to
enable signing with your persistent release key:

| Secret | Value |
| --- | --- |
| `ANDROID_KEYSTORE_BASE64` | Base64-encoded release keystore |
| `ANDROID_KEYSTORE_PASSWORD` | Keystore password |
| `ANDROID_KEY_ALIAS` | Signing key alias |
| `ANDROID_KEY_PASSWORD` | Signing key password |

Keep keys and passwords outside Git. Reuse the same key for future updates.
This fork does not require the original author's certificate.

Missing/incomplete secrets or signing failures produce an aligned
`GlassMic-<version>-release-unsigned.apk`. It needs signing before installation.
Successful signing produces `GlassMic-<version>-release.apk` and `signature.txt`.
Both outcomes include `SHA256SUMS.txt` and `build-info.txt` with the signing status.

Download the result from the run's **Artifacts** section. No release is published
automatically, and this fork does not push to the upstream module mirror.
