const { ApolloServer } = require("apollo-server");
const { ApolloGateway } = require("@apollo/gateway");

const gateway = new ApolloGateway({
    serviceList: [
        // This entire `serviceList` is optional when running in managed federation
        // mode, using Apollo Graph Manager as the source of truth.  In production,
        // using a single source of truth to compose a schema is recommended and
        // prevents composition failures at runtime using schema validation using
        // real usage-based metrics.
        { name: "order", url: "http://localhost:8081/graphql" },
        { name: "account", url: "http://localhost:8080/graphql" },
    ],

    // Experimental: Enabling this enables the query plan view in Playground.
    __exposeQueryPlanExperimental: false,
});

(async () => {
    const server = new ApolloServer({
        gateway,

        // Apollo Graph Manager (previously known as Apollo Engine)
        // When enabled and an `ENGINE_API_KEY` is set in the environment,
        // provides metrics, schema management and trace reporting.
        engine: false,

        // Subscriptions are unsupported but planned for a future Gateway version.
        subscriptions: false,
    });

    server.listen().then(({ url }) => {
        console.log(`🚀 Server ready at ${url}`);
    });
})();