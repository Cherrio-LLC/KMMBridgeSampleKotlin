// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/Cherrio-LLC/KMMBridgeSampleKotlin/KMMBridgeSampleKotlin/shared-kmmbridge/0.1.1/shared-kmmbridge-0.1.1.zip"
let remoteKotlinChecksum = "e4411868f1876a02c37ce110d3d2ab5402c83fb662e92fca94b56752fcbc092a"
let packageName = "shared"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)